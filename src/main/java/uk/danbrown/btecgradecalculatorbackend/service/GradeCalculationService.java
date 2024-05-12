package uk.danbrown.btecgradecalculatorbackend.service;

import org.springframework.stereotype.Service;
import uk.danbrown.btecgradecalculatorbackend.Model.*;
import uk.danbrown.btecgradecalculatorbackend.repository.CourseInformationRepository;
import uk.danbrown.btecgradecalculatorbackend.repository.GradeRepository;
import uk.danbrown.btecgradecalculatorbackend.repository.UcasPointRepository;
import uk.danbrown.btecgradecalculatorbackend.repository.UnitRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static uk.danbrown.btecgradecalculatorbackend.Model.Grade.*;
import static uk.danbrown.btecgradecalculatorbackend.Model.GradeWithUcasPoints.Builder.aGradeWithUcasPoints;
import static uk.danbrown.btecgradecalculatorbackend.Model.GradesCalculation.Builder.aGradesCalculation;
import static uk.danbrown.btecgradecalculatorbackend.Model.UnitGradeCalculationRequest.Builder.anUnitGradeCalculationRequest;
import static uk.danbrown.btecgradecalculatorbackend.repository.UnitEntity.GENERIC_OPTIONAL_UNIT;

@Service
public class GradeCalculationService {

    // TODO fix this not nice
    private final CourseInformationRepository courseInformationRepository;
    private final GradeRepository gradeRepository;
    private final UnitRepository unitRepository;
    private final UcasPointRepository ucasPointRepository;

    public GradeCalculationService(CourseInformationRepository courseInformationRepository, GradeRepository gradeRepository, UnitRepository unitRepository, UcasPointRepository ucasPointRepository) {
        this.courseInformationRepository = courseInformationRepository;
        this.gradeRepository = gradeRepository;
        this.unitRepository = unitRepository;
        this.ucasPointRepository = ucasPointRepository;
    }

    private static final double CURRENT_GRADE_COEFFICIENT = 0.0;
    private static final double MAX_GRADE_COEFFICIENT = 2.66666667;
    private static final Map<Grade, Double> gradeCoefficientMap = Map.ofEntries(
            Map.entry(UNCLASSIFIED, 0.0),
            Map.entry(NEAR_PASS, 0.66666667),
            Map.entry(PASS, 1.0),
            Map.entry(MERIT, 1.66666667),
            Map.entry(DISTINCTION, 2.66666667)
    );

    public GradesCalculation calculateGrades(CourseGradeCalculationRequest gradeCalculationRequest) {
        Course actualCourse = courseInformationRepository.getCourseByType(gradeCalculationRequest.courseType());
        int missingOptionalUnitCount = (actualCourse.mandatoryUnits().size() + actualCourse.optionalUnitCount()) -
                                       gradeCalculationRequest.units().size();
        for (int i = 0; i < missingOptionalUnitCount; i++) {
            gradeCalculationRequest.units().add(anUnitGradeCalculationRequest()
                            .withUnitName(GENERIC_OPTIONAL_UNIT.getName())
                            .withGrade(PENDING)
                    .build());
        }

        double predictedCoefficient = gradeCalculationRequest.units()
                .stream()
                .map(UnitGradeCalculationRequest::grade)
                .filter(unit -> unit != PENDING)
                .mapToDouble(gradeCoefficientMap::get)
                .average()
                .orElse(0.0);

        Map<Integer, List<Grade>> pointGradeMap = gradeRepository
                .getPointsToGradeMap(gradeCalculationRequest.courseType());

        List<List<Grade>> grades = Stream.of(CURRENT_GRADE_COEFFICIENT, MAX_GRADE_COEFFICIENT, predictedCoefficient)
                .map(coefficient -> getPoints(gradeCalculationRequest, coefficient))
                .map(points -> pointsToGrade(pointGradeMap, points))
                .toList();

        String currentGrade = mapGrades(pointsToGrade(pointGradeMap, getPoints(gradeCalculationRequest, CURRENT_GRADE_COEFFICIENT)));
        String expectedGrade = mapGrades(pointsToGrade(pointGradeMap, getPoints(gradeCalculationRequest, predictedCoefficient)));
        String maximumGrade = mapGrades(pointsToGrade(pointGradeMap, getPoints(gradeCalculationRequest, MAX_GRADE_COEFFICIENT)));

        return aGradesCalculation()
                .withCurrentGrade(aGradeWithUcasPoints()
                        .withGrade(currentGrade)
                        .withUcasPoints(ucasPointRepository.getUcasPointsFromGrade(gradeCalculationRequest.courseType(), currentGrade))
                        .build())
                .withExpectedGrade(aGradeWithUcasPoints()
                        .withGrade(expectedGrade)
                        .withUcasPoints(ucasPointRepository.getUcasPointsFromGrade(gradeCalculationRequest.courseType(), expectedGrade))
                        .build())
                .withMaximumGrade(aGradeWithUcasPoints()
                        .withGrade(maximumGrade)
                        .withUcasPoints(ucasPointRepository.getUcasPointsFromGrade(gradeCalculationRequest.courseType(), maximumGrade))
                        .build())
                .build();
    }

    private int getPoints(CourseGradeCalculationRequest course, double pendingCoefficient) {
        int totalPoints = 0;
        for (UnitGradeCalculationRequest unit : course.units()) {
            if (unit.grade().equals(UNCLASSIFIED)) {
                return 0;
            }
            double coefficient = unit.grade() == PENDING ? pendingCoefficient :
                    gradeCoefficientMap.get(unit.grade());

            totalPoints += (int) (coefficient * unitRepository.getGuidedLearningHoursByUnitName(unit.unitName()) / 10);
        }
        return totalPoints;
    }

    private List<Grade> pointsToGrade(Map<Integer, List<Grade>> pointsToGradeMap, int points) {
        int currentClosestThresholdDifference = Integer.MAX_VALUE;
        int current_threshold = 0;
        for (int threshold : pointsToGradeMap.keySet()) {
            int difference = threshold - points;
            if (currentClosestThresholdDifference > 0 || (difference <= 0 &&
                                                          (difference > currentClosestThresholdDifference))) {
                currentClosestThresholdDifference = difference;
                current_threshold = threshold;
            }
        }
        return pointsToGradeMap.get(current_threshold);
    }

    private String mapGrades(List<Grade> grades) {
        return grades.stream().map(Grade::getValue).collect(Collectors.joining());
    }
}

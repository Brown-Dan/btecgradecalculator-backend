package uk.danbrown.btecgradecalculatorbackend.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.danbrown.btecgradecalculatorbackend.Model.CourseGradeCalculationRequest;
import uk.danbrown.btecgradecalculatorbackend.Model.GradesCalculation;
import uk.danbrown.btecgradecalculatorbackend.repository.CourseInformationRepository;
import uk.danbrown.btecgradecalculatorbackend.repository.GradeRepository;
import uk.danbrown.btecgradecalculatorbackend.repository.UcasPointRepository;
import uk.danbrown.btecgradecalculatorbackend.repository.UnitRepository;

import java.util.List;

import static uk.danbrown.btecgradecalculatorbackend.Model.CourseGradeCalculationRequest.Builder.aCourseGradeCalculationRequest;
import static uk.danbrown.btecgradecalculatorbackend.Model.Grade.DISTINCTION;
import static uk.danbrown.btecgradecalculatorbackend.Model.GradeWithUcasPoints.Builder.aGradeWithUcasPoints;
import static uk.danbrown.btecgradecalculatorbackend.Model.GradesCalculation.Builder.aGradesCalculation;
import static uk.danbrown.btecgradecalculatorbackend.Model.UnitGradeCalculationRequest.Builder.anUnitGradeCalculationRequest;

public class GradesCalculationServiceTest {

    private GradeCalculationService gradeCalculationService;

    @BeforeEach
    void setUp() {
        gradeCalculationService = new GradeCalculationService(
                new CourseInformationRepository(),
                new GradeRepository(),
                new UnitRepository(),
                new UcasPointRepository());
    }

    @Test
    void calculateGrades_givenCourseGradeCalculationRequest_shouldReturnAccurateCalculations() {
        CourseGradeCalculationRequest courseGradeCalculationRequest =
                aCourseGradeCalculationRequest()
                        .withCourseType("National Foundation Diploma")
                        .withUnits(
                                List.of(
                                        anUnitGradeCalculationRequest()
                                                .withUnitName("Principles of Computer Science")
                                                .withGrade(DISTINCTION)
                                                .build(),
                                        anUnitGradeCalculationRequest()
                                                .withUnitName("Fundamentals of Computer Systems")
                                                .withGrade(DISTINCTION)
                                                .build(),
                                        anUnitGradeCalculationRequest()
                                                .withUnitName("IT Systems Security and Encryption")
                                                .withGrade(DISTINCTION)
                                                .build(),
                                        anUnitGradeCalculationRequest()
                                                .withUnitName("Business Applications of Social Media")
                                                .withGrade(DISTINCTION)
                                                .build(),
                                        anUnitGradeCalculationRequest()
                                                .withUnitName("Website Development")
                                                .withGrade(DISTINCTION)
                                                .build(),
                                        anUnitGradeCalculationRequest()
                                                .withUnitName("Systems Analysis and Design")
                                                .withGrade(DISTINCTION)
                                                .build()
                                )
                        ).build();

        GradesCalculation expectedGradesCalculation = aGradesCalculation()
                .withCurrentGrade(aGradeWithUcasPoints()
                        .withGrade("D*")
                        .withUcasPoints(84)
                        .build())
                .withMaximumGrade(aGradeWithUcasPoints()
                        .withGrade("D*")
                        .withUcasPoints(84)
                        .build())
                .withExpectedGrade(aGradeWithUcasPoints()
                        .withGrade("D*")
                        .withUcasPoints(84)
                        .build())
                .build();

        GradesCalculation result = gradeCalculationService.calculateGrades(courseGradeCalculationRequest);

        Assertions.assertThat(result).isEqualTo(expectedGradesCalculation);
    }
}

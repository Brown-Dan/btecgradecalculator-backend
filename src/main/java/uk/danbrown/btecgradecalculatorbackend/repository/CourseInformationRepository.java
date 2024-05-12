package uk.danbrown.btecgradecalculatorbackend.repository;

import org.springframework.stereotype.Repository;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static uk.danbrown.btecgradecalculatorbackend.Model.Course.Builder.aCourse;

@Repository
public class CourseInformationRepository {

    private static final Map<String, CourseEntity> courseTypeToCourseMap =
            Arrays.stream(CourseEntity.values()).collect(Collectors.toMap(CourseEntity::getCourseType, Function.identity()));

    public Optional<Course> findCourseByType(String courseType) {
        return Optional.ofNullable(courseTypeToCourseMap.get(courseType))
                .map(this::mapCourseEntityToCourse);
    }

    public Course getCourseByType(String courseType) {
        return mapCourseEntityToCourse(courseTypeToCourseMap.get(courseType));
    }

    private Course mapCourseEntityToCourse(CourseEntity courseEntity) {
        return aCourse()
                .withCourseType(courseEntity.getCourseType())
                .withMandatoryUnits(courseEntity.getMandatoryUnits().stream().map(UnitEntity::getName).toList())
                .withOptionalUnits(courseEntity.getOptionalUnits().stream().map(UnitEntity::getName).toList())
                .withOptionalUnitCount(courseEntity.getOptionalUnitCount())
                .withUnitCount(courseEntity.getUnitCount())
                .withUcasPoints(courseEntity.getMaximumUcasPoints())
                .withALevelEquivalent(courseEntity.getaLevelEquivalent())
                .withDescription(courseEntity.getDescription())
                .withGuidedLearningHours(courseEntity.getGuidedLearningHours())
                .build();
    }
}

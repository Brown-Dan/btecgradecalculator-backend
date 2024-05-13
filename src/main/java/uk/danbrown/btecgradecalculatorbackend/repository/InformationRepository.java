package uk.danbrown.btecgradecalculatorbackend.repository;

import org.springframework.stereotype.Repository;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static uk.danbrown.btecgradecalculatorbackend.Model.Course.Builder.aCourse;

@Repository
public class InformationRepository {

    public Optional<Course> findCourseBySubjectAndType(String subject, String courseType) {
        return Arrays.stream(SubjectEntity.values())
                .filter(sbj -> sbj.getSubject().equalsIgnoreCase(subject))
                .findFirst().flatMap(entity -> Arrays.stream(CourseEntity.values())
                .filter(courseTyp -> courseTyp.getSubject().equalsIgnoreCase(entity.getSubject()))
                .filter(courseTyp -> courseTyp.getCourseType().equalsIgnoreCase(courseType))
                .findFirst()
                .map(this::mapCourseEntityToCourse));

    }

    public Course getCourseByType(String subject, String courseType) {
        return findCourseBySubjectAndType(subject, courseType).get();
    }

    public List<String> getSupportedCourseTypes(String subject) {
        return Arrays.stream(SubjectEntity.values())
                .filter(sbj -> sbj.getSubject().equalsIgnoreCase(subject))
                .findFirst()
                .map(sbj -> sbj.getCourseTypes().stream().map(CourseEntity::getCourseType).toList())
                .get();
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

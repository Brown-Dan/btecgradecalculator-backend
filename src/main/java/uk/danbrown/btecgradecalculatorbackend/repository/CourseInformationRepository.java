package uk.danbrown.btecgradecalculatorbackend.repository;

import org.springframework.stereotype.Repository;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
public class CourseInformationRepository {

    private static final Map<String, CourseEntity> courseTypeToCourseMap =
            Arrays.stream(CourseEntity.values()).collect(Collectors.toMap(CourseEntity::getCourseType, Function.identity()));

    public Course getCourseByCourseType(String courseType) {
        return mapCourseEntityToCourse(courseTypeToCourseMap.get(courseType));
    }

    private Course mapCourseEntityToCourse(CourseEntity courseEntity) {
        return new Course(courseEntity.getCourseType(),
                courseEntity.getMandatoryUnits().stream().map(UnitEntity::getName).toList(),
                courseEntity.getOptionalUnits().stream().map(UnitEntity::getName).toList(),
                courseEntity.getOptionalUnitCount()
        );
    }
}

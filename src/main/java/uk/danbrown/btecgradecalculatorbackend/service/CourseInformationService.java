package uk.danbrown.btecgradecalculatorbackend.service;

import org.springframework.stereotype.Service;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;
import uk.danbrown.btecgradecalculatorbackend.repository.CourseInformationRepository;

@Service
public class CourseInformationService {

    private final CourseInformationRepository courseInformationRepository;

    public CourseInformationService(CourseInformationRepository courseInformationRepository) {
        this.courseInformationRepository = courseInformationRepository;
    }

    public Course getCourseById(String courseType) {
        return courseInformationRepository.getCourseByCourseType(courseType);
    }
}

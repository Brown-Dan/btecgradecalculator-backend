package uk.danbrown.btecgradecalculatorbackend.service;

import org.springframework.stereotype.Service;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;
import uk.danbrown.btecgradecalculatorbackend.repository.CourseInformationRepository;

import java.util.Optional;

@Service
public class CourseInformationService {

    private final CourseInformationRepository courseInformationRepository;

    public CourseInformationService(CourseInformationRepository courseInformationRepository) {
        this.courseInformationRepository = courseInformationRepository;
    }

    public Optional<Course> getCourseById(String courseType) {
        return courseInformationRepository.findCourseByType(courseType);
    }
}

package uk.danbrown.btecgradecalculatorbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;
import uk.danbrown.btecgradecalculatorbackend.service.CourseInformationService;

@RestController
@RequestMapping("/information")
public class CourseInformationController {

    private final CourseInformationService courseInformationService;

    public CourseInformationController(CourseInformationService courseInformationService) {
        this.courseInformationService = courseInformationService;
    }

    @GetMapping("/{courseType}")
    public ResponseEntity<Course> getCourseById(@PathVariable String courseType) {
        return ResponseEntity.ok(courseInformationService.getCourseById(courseType));
    }
}

package uk.danbrown.btecgradecalculatorbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;
import uk.danbrown.btecgradecalculatorbackend.service.InformationService;

import java.util.List;
import java.util.Optional;

import static java.util.Map.of;

@RestController
@RequestMapping("/information")
public class InformationController {

    private final InformationService informationService;

    public InformationController(InformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping("/{subject}/{courseType}")
    public ResponseEntity<?> findCourseTypeInformation(@PathVariable String courseType, @PathVariable String subject) {
        Optional<Course> course = informationService.findCourseBySubjectAndType(subject, courseType);

        if (course.isPresent()) {
            return ResponseEntity.ok(course.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{subject}")
    public ResponseEntity<?> getCoursesBySubject(@PathVariable String subject) {
        Optional<List<Course>> subjectInformation = informationService.getCoursesBySubject(subject);

        if (subjectInformation.isPresent()) {
            return ResponseEntity.ok(subjectInformation.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/{subject}/types")
    public ResponseEntity<?> getSupportedTypesBySubject(@PathVariable String subject) {
        return ResponseEntity.ok(of("supportedTypes", informationService.getSupportedCourseTypes(subject)));
    }
}

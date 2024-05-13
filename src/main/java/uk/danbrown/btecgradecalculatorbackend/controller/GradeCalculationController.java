package uk.danbrown.btecgradecalculatorbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.danbrown.btecgradecalculatorbackend.Model.CourseGradeCalculationRequest;
import uk.danbrown.btecgradecalculatorbackend.service.GradeCalculationService;

@RestController
@RequestMapping("/calculate")
public class GradeCalculationController {

    private final GradeCalculationService gradeCalculationService;

    public GradeCalculationController(GradeCalculationService gradeCalculationService) {
        this.gradeCalculationService = gradeCalculationService;
    }

    @PostMapping("/{subject}")
    public ResponseEntity<?> calculateGrade(@RequestBody CourseGradeCalculationRequest courseGradeCalculationRequest, @PathVariable String subject) {
        return ResponseEntity.ok(gradeCalculationService.calculateGrades(courseGradeCalculationRequest.addSubject(subject)));
    }
}

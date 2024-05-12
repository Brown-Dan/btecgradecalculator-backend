package uk.danbrown.btecgradecalculatorbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.danbrown.btecgradecalculatorbackend.Model.CourseGradeCalculationRequest;
import uk.danbrown.btecgradecalculatorbackend.service.GradeCalculationService;

@RestController
@RequestMapping("/calculate")
public class GradeCalculationController {

    private final GradeCalculationService gradeCalculationService;

    public GradeCalculationController(GradeCalculationService gradeCalculationService) {
        this.gradeCalculationService = gradeCalculationService;
    }

    @PostMapping()
    public ResponseEntity<?> calculateGrade(@RequestBody CourseGradeCalculationRequest courseGradeCalculationRequest) {
        return ResponseEntity.ok(gradeCalculationService.calculateGrades(courseGradeCalculationRequest));
    }
}

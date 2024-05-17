package uk.danbrown.btecgradecalculatorbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(GradeCalculationController.class);

    public GradeCalculationController(GradeCalculationService gradeCalculationService) {
        this.gradeCalculationService = gradeCalculationService;
    }

    @PostMapping()
    public ResponseEntity<?> calculateGrade(@RequestBody CourseGradeCalculationRequest courseGradeCalculationRequest) {
        LOG.info("Received Grade Calculation Request with data - {}", courseGradeCalculationRequest);
        return ResponseEntity.ok(gradeCalculationService.calculateGrades(courseGradeCalculationRequest));
    }
}

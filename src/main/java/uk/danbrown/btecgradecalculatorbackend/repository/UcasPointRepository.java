package uk.danbrown.btecgradecalculatorbackend.repository;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UcasPointRepository {

    private static final Map<String, Integer> EXTENDED_DIPLOMA_GRADE_TO_UCAS = Map.ofEntries(
            Map.entry("D*D*D*", 168),
            Map.entry("D*D*D", 160),
            Map.entry("D*DD", 144),
            Map.entry("DDM", 128),
            Map.entry("DMM", 112),
            Map.entry("MMM", 96),
            Map.entry("MMP", 80),
            Map.entry("MPP", 64),
            Map.entry("PPP", 64)
    );

    private static final Map<String, Integer> DIPLOMA_GRADE_TO_UCAS = Map.ofEntries(
            Map.entry("D*D*", 112),
            Map.entry("D*D", 104),
            Map.entry("DD", 96),
            Map.entry("DM", 80),
            Map.entry("MM", 64),
            Map.entry("MP", 48),
            Map.entry("PP", 32)
    );

    private static final Map<String, Integer> FOUNDATION_DIPLOMA_TO_UCAS = Map.ofEntries(
            Map.entry("D*", 84),
            Map.entry("D", 72),
            Map.entry("M", 48),
            Map.entry("P", 24)
    );

    private static final Map<String, Integer> EXTENDED_CERTIFICATE_TO_UCAS = Map.ofEntries(
            Map.entry("D*", 56),
            Map.entry("D", 48),
            Map.entry("M", 32),
            Map.entry("P", 16)
    );

    private static final Map<String, Integer> CERTIFICATE_TO_UCAS = Map.ofEntries(
            Map.entry("D*", 28),
            Map.entry("D", 24),
            Map.entry("M", 16),
            Map.entry("P", 8)
    );

    private static final Map<String, Map<String, Integer>> COURSE_TO_UCAS_MAP = Map.of(
            CourseEntity.NATIONAL_CERTIFICATE.getCourseType(), CERTIFICATE_TO_UCAS,
            CourseEntity.NATIONAL_EXTENDED_CERTIFICATE.getCourseType(), EXTENDED_CERTIFICATE_TO_UCAS,
            CourseEntity.NATIONAL_FOUNDATION_DIPLOMA.getCourseType(), FOUNDATION_DIPLOMA_TO_UCAS,
            CourseEntity.NATIONAL_DIPLOMA.getCourseType(), DIPLOMA_GRADE_TO_UCAS,
            CourseEntity.NATIONAL_EXTENDED_DIPLOMA.getCourseType(), EXTENDED_DIPLOMA_GRADE_TO_UCAS
    );

    public Integer getUcasPointsFromGrade(String courseName, String grade) {
        return COURSE_TO_UCAS_MAP.get(courseName).getOrDefault(grade, 0);
    }
}


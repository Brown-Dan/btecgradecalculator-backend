package uk.danbrown.btecgradecalculatorbackend.repository;

import org.springframework.stereotype.Repository;
import uk.danbrown.btecgradecalculatorbackend.Model.Grade;

import java.util.List;
import java.util.Map;

import static uk.danbrown.btecgradecalculatorbackend.Model.Grade.*;

@Repository
public class GradeRepository {

    private static final Map<Integer, List<Grade>> CERTIFICATE_POINTS_TO_GRADE =
            Map.ofEntries(
                    Map.entry(0, List.of(UNCLASSIFIED)),
                    Map.entry(18, List.of(PASS)),
                    Map.entry(26, List.of(MERIT)),
                    Map.entry(42, List.of(DISTINCTION)),
                    Map.entry(48, List.of(DISTINCTION_STAR))
            );

    private static final Map<Integer, List<Grade>> EXTENDED_CERTIFICATE_POINTS_TO_GRADE =
            Map.ofEntries(
                    Map.entry(0, List.of(UNCLASSIFIED)),
                    Map.entry(36, List.of(PASS)),
                    Map.entry(52, List.of(MERIT)),
                    Map.entry(74, List.of(DISTINCTION)),
                    Map.entry(90, List.of(DISTINCTION_STAR))
            );

    private static final Map<Integer, List<Grade>> FOUNDATION_DIPLOMA_POINTS_TO_GRADE =
            Map.ofEntries(
                    Map.entry(0, List.of(UNCLASSIFIED)),
                    Map.entry(51, List.of(PASS)),
                    Map.entry(73, List.of(MERIT)),
                    Map.entry(104, List.of(DISTINCTION)),
                    Map.entry(130, List.of(DISTINCTION_STAR))
            );

    private static final Map<Integer, List<Grade>> DIPLOMA_POINTS_TO_GRADE =
            Map.ofEntries(
                    Map.entry(0, List.of(UNCLASSIFIED)),
                    Map.entry(72, List.of(PASS, PASS)),
                    Map.entry(88, List.of(MERIT, PASS)),
                    Map.entry(104, List.of(MERIT, MERIT)),
                    Map.entry(124, List.of(DISTINCTION, MERIT)),
                    Map.entry(144, List.of(DISTINCTION, DISTINCTION)),
                    Map.entry(162, List.of(DISTINCTION_STAR, DISTINCTION)),
                    Map.entry(180, List.of(DISTINCTION_STAR, DISTINCTION_STAR))
            );

    private static final Map<Integer, List<Grade>> EXTENDED_DIPLOMA_POINTS_GRADE =
            Map.ofEntries(
                    Map.entry(0, List.of(UNCLASSIFIED)),
                    Map.entry(108, List.of(PASS, PASS, PASS)),
                    Map.entry(124, List.of(MERIT, PASS, PASS)),
                    Map.entry(140, List.of(MERIT, MERIT, PASS)),
                    Map.entry(156, List.of(MERIT, MERIT, MERIT)),
                    Map.entry(176, List.of(DISTINCTION, MERIT, MERIT)),
                    Map.entry(196, List.of(DISTINCTION, DISTINCTION, MERIT)),
                    Map.entry(216, List.of(DISTINCTION, DISTINCTION, DISTINCTION)),
                    Map.entry(234, List.of(DISTINCTION_STAR, DISTINCTION, DISTINCTION)),
                    Map.entry(252, List.of(DISTINCTION_STAR, DISTINCTION_STAR, DISTINCTION)),
                    Map.entry(270, List.of(DISTINCTION_STAR, DISTINCTION_STAR, DISTINCTION_STAR))
            );

    private static final Map<String, Map<Integer, List<Grade>>> COURSE_TYPE_TO_POINTS_TO_GRADE =
            Map.of(
                    "National Certificate", CERTIFICATE_POINTS_TO_GRADE,
                    "National Extended Certificate", EXTENDED_CERTIFICATE_POINTS_TO_GRADE,
                    "National Foundation Diploma", FOUNDATION_DIPLOMA_POINTS_TO_GRADE,
                    "National Diploma", DIPLOMA_POINTS_TO_GRADE,
                    "National Extended Diploma", EXTENDED_DIPLOMA_POINTS_GRADE
            );

    public Map<Integer, List<Grade>> getPointsToGradeMap(String courseType) {
        return COURSE_TYPE_TO_POINTS_TO_GRADE.get(courseType);
    }
}

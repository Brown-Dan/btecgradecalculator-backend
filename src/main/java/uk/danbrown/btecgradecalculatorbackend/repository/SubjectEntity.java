package uk.danbrown.btecgradecalculatorbackend.repository;

import java.util.List;

public enum SubjectEntity {
    COMPUTING("Computing", List.of(CourseEntity.NATIONAL_CERTIFICATE_COMPUTING, CourseEntity.NATIONAL_EXTENDED_CERTIFICATE_COMPUTING, CourseEntity.NATIONAL_FOUNDATION_DIPLOMA_COMPUTING, CourseEntity.NATIONAL_DIPLOMA_COMPUTING, CourseEntity.NATIONAL_EXTENDED_DIPLOMA_COMPUTING)),
    BUSINESS("Business",  List.of(CourseEntity.NATIONAL_CERTIFICATE_BUSINESS, CourseEntity.NATIONAL_EXTENDED_CERTIFICATE_BUSINESS, CourseEntity.NATIONAL_FOUNDATION_DIPLOMA_BUSINESS, CourseEntity.NATIONAL_DIPLOMA_BUSINESS, CourseEntity.NATIONAL_EXTENDED_DIPLOMA_BUSINESS));

    private final String subject;
    private final List<CourseEntity> courseTypes;

    SubjectEntity(String subject, List<CourseEntity> courseTypes) {
        this.subject = subject;
        this.courseTypes = courseTypes;
    }

    public String getSubject() {
        return subject;
    }

    public List<CourseEntity> getCourseTypes() {
        return courseTypes;
    }
}

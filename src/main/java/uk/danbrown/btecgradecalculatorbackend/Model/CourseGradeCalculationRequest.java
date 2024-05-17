package uk.danbrown.btecgradecalculatorbackend.Model;

import java.util.List;

public record CourseGradeCalculationRequest(String subject, String courseType,
                                            List<UnitGradeCalculationRequest> units) {

    public CourseGradeCalculationRequest addSubject(String subject) {
        return new CourseGradeCalculationRequest(subject, courseType, units);
    }

    public static final class Builder {
        private String subject;
        private String courseType;
        private List<UnitGradeCalculationRequest> units;

        private Builder() {
        }

        public static Builder aCourseGradeCalculationRequest() {
            return new Builder();
        }

        public Builder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder withCourseType(String courseType) {
            this.courseType = courseType;
            return this;
        }

        public Builder withUnits(List<UnitGradeCalculationRequest> units) {
            this.units = units;
            return this;
        }

        public CourseGradeCalculationRequest build() {
            return new CourseGradeCalculationRequest(subject, courseType, units);
        }
    }
}

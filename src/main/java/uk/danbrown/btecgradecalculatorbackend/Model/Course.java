package uk.danbrown.btecgradecalculatorbackend.Model;

import java.util.List;

public record Course(String courseType,
                     List<String> mandatoryUnits,
                     List<String> optionalUnits,
                     Integer optionalUnitCount,
                     Integer ucasPoints,
                     Integer guidedLearningHours,
                     Integer unitCount,
                     String aLevelEquivalent,
                     String description) {

    public static final class Builder {
        private String courseType;
        private List<String> mandatoryUnits;
        private List<String> optionalUnits;
        private Integer optionalUnitCount;
        private Integer ucasPoints;
        private Integer guidedLearningHours;
        private Integer unitCount;
        private String aLevelEquivalent;
        private String description;

        private Builder() {
        }

        public static Builder aCourse() {
            return new Builder();
        }

        public Builder withCourseType(String courseType) {
            this.courseType = courseType;
            return this;
        }

        public Builder withMandatoryUnits(List<String> mandatoryUnits) {
            this.mandatoryUnits = mandatoryUnits;
            return this;
        }

        public Builder withOptionalUnits(List<String> optionalUnits) {
            this.optionalUnits = optionalUnits;
            return this;
        }

        public Builder withOptionalUnitCount(Integer optionalUnitCount) {
            this.optionalUnitCount = optionalUnitCount;
            return this;
        }

        public Builder withUcasPoints(Integer ucasPoints) {
            this.ucasPoints = ucasPoints;
            return this;
        }

        public Builder withGuidedLearningHours(Integer guidedLearningHours) {
            this.guidedLearningHours = guidedLearningHours;
            return this;
        }

        public Builder withUnitCount(Integer unitCount) {
            this.unitCount = unitCount;
            return this;
        }

        public Builder withALevelEquivalent(String aLevelEquivalent) {
            this.aLevelEquivalent = aLevelEquivalent;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Course build() {
            return new Course(courseType, mandatoryUnits, optionalUnits, optionalUnitCount, ucasPoints, guidedLearningHours, unitCount, aLevelEquivalent, description);
        }
    }
}

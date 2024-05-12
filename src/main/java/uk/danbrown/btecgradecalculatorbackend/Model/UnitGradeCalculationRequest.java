package uk.danbrown.btecgradecalculatorbackend.Model;

public record UnitGradeCalculationRequest(String unitName, Grade grade) {

    public static final class Builder {
        private String unitName;
        private Grade grade;

        private Builder() {
        }

        public static Builder anUnitGradeCalculationRequest() {
            return new Builder();
        }

        public Builder withUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }

        public Builder withGrade(Grade grade) {
            this.grade = grade;
            return this;
        }

        public UnitGradeCalculationRequest build() {
            return new UnitGradeCalculationRequest(unitName, grade);
        }
    }
}

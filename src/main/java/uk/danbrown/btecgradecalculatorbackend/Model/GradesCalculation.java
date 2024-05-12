package uk.danbrown.btecgradecalculatorbackend.Model;

public record GradesCalculation(GradeWithUcasPoints currentGrade, GradeWithUcasPoints expectedGrade,
                                GradeWithUcasPoints maximumGrade) {

    public static final class Builder {
        private GradeWithUcasPoints currentGrade;
        private GradeWithUcasPoints expectedGrade;
        private GradeWithUcasPoints maximumGrade;

        private Builder() {
        }

        public static Builder aGradesCalculation() {
            return new Builder();
        }

        public Builder withCurrentGrade(GradeWithUcasPoints currentGrade) {
            this.currentGrade = currentGrade;
            return this;
        }

        public Builder withExpectedGrade(GradeWithUcasPoints expectedGrade) {
            this.expectedGrade = expectedGrade;
            return this;
        }

        public Builder withMaximumGrade(GradeWithUcasPoints maximumGrade) {
            this.maximumGrade = maximumGrade;
            return this;
        }

        public GradesCalculation build() {
            return new GradesCalculation(currentGrade, expectedGrade, maximumGrade);
        }
    }
}

package uk.danbrown.btecgradecalculatorbackend.Model;

public record GradeWithUcasPoints(String grade, Integer ucasPoints) {

    public static final class Builder {
        private String grade;
        private Integer ucasPoints;

        private Builder() {
        }

        public static Builder aGradeWithUcasPoints() {
            return new Builder();
        }

        public Builder withGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public Builder withUcasPoints(Integer ucasPoints) {
            this.ucasPoints = ucasPoints;
            return this;
        }

        public GradeWithUcasPoints build() {
            return new GradeWithUcasPoints(grade, ucasPoints);
        }
    }
}

package uk.danbrown.btecgradecalculatorbackend.Model;

public enum Grade {
    PENDING("PENDING"),
    UNCLASSIFIED("U"),
    NEAR_PASS("NP"),
    PASS("P"),
    MERIT("M"),
    DISTINCTION("D"),
    DISTINCTION_STAR("D*");

    private final String value;

    Grade(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

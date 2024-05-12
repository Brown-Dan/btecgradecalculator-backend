package uk.danbrown.btecgradecalculatorbackend.repository;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.danbrown.btecgradecalculatorbackend.repository.UnitEntity.*;

public enum CourseEntity {
    NATIONAL_CERTIFICATE("National Certificate",
            List.of(FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION),
            emptyList(),
            180, 28, "0.5 A Levels", "This qualification is designed to be an " +
                                     "introduction to the computing sector " +
                                     "through applied learning. The " +
                                     "qualification supports progression to " +
                                     "higher education when taken as part of " +
                                     "a programme of study that includes " +
                                     "other vocational or general " +
                                     "qualifications.", 0),
    NATIONAL_EXTENDED_CERTIFICATE("National Extended Certificate",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN),
            360, 56, "1 A Level", "This qualification is designed to support " +
                                  "learners who are interested in learning " +
                                  "about the computing sector alongside " +
                                  "other fields of study, with a view to " +
                                  "progressing to a wide range of higher " +
                                  "education courses, not necessarily in " +
                                  "the computing sector. It is designed to " +
                                  "be taken as part of a programme of " +
                                  "study that includes other appropriate " +
                                  "BTEC Nationals or A Levels.", 1),
    NATIONAL_FOUNDATION_DIPLOMA("National Foundation Diploma",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION, BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN),
            510, 84, "1.5 A Levels", "This qualification is designed to support " +
                                     "learners who wish to study computing " +
                                     "as a one-year, full-time course, or for " +
                                     "those wishing to take it alongside " +
                                     "another area of complementary or " +
                                     "contrasting study, as part of a two-year, " +
                                     "full-time study programme. If taken as " +
                                     "part of a programme of study that " +
                                     "includes other appropriate BTEC " +
                                     "Nationals or A Levels, it supports " +
                                     "progression to higher education.", 2),
    NATIONAL_DIPLOMA("National Diploma",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION, BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA, THE_IMPACT_OF_COMPUTING),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN, DIGITAL_AUDIO, DIGITAL_VIDEO, OBJECT_ORIENTED_PROGRAMMING, RELATIONAL_DATABASE_DEVELOPMENT, COMPUTER_NETWORKING, VIRTUALISATION, SYSTEMS_METHODOLOGY),
            720, 112, "2 A Levels", "This qualification is designed to support " +
                                    "learners who want an in-depth study of " +
                                    "the computing sector as part of a 16–19 " +
                                    "study programme. This programme may " +
                                    "include other BTEC Nationals or A Levels " +
                                    "to support progression to higher " +
                                    "education courses in computing areas " +
                                    "before entering employment. The " +
                                    "additional qualification(s) studied allow " +
                                    "learners either to give breadth to their " +
                                    "study programme by choosing a " +
                                    "contrasting subject, or to give it more " +
                                    "focus by choosing a complementary " +
                                    "subject.", 2),
    NATIONAL_EXTENDED_DIPLOMA("National Extended Diploma",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION, BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA, THE_IMPACT_OF_COMPUTING, SOFTWARE_DESIGN_AND_DEVELOPMENT_PROJECT, PLANNING_AND_MANAGEMENT_OF_COMPUTING_PROJECTS),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN, DIGITAL_AUDIO, DIGITAL_VIDEO, OBJECT_ORIENTED_PROGRAMMING, RELATIONAL_DATABASE_DEVELOPMENT, COMPUTER_NETWORKING, VIRTUALISATION, SYSTEMS_METHODOLOGY),
            1080, 168, "3 A Levels", "This qualification is designed to support " +
                                     "learners who are interested in a " +
                                     "two-year, full-time course that meets " +
                                     "entry requirements for a course in " +
                                     "computer-related study at higher " +
                                     "education. The qualification enables " +
                                     "learners to explore a choice of sector " +
                                     "areas, enabling progression to either " +
                                     "higher education or employment in the " +
                                     "computing sector.", 6);

    private final String courseType;
    private final List<UnitEntity> mandatoryUnitEntities;
    private final List<UnitEntity> optionalUnitEntities;
    private final Integer guidedLearningHours;
    private final Integer maximumUcasPoints;
    private final String aLevelEquivalent;
    private final String description;
    private final Integer optionalUnitCount;

    CourseEntity(String courseType, List<UnitEntity> mandatoryUnitEntities, List<UnitEntity> optionalUnitEntities, Integer guidedLearningHours, Integer maximumUcasPoints, String aLevelEquivalent, String description, Integer optionalUnitCount) {
        this.courseType = courseType;
        this.mandatoryUnitEntities = mandatoryUnitEntities;
        this.optionalUnitEntities = optionalUnitEntities;
        this.guidedLearningHours = guidedLearningHours;
        this.maximumUcasPoints = maximumUcasPoints;
        this.aLevelEquivalent = aLevelEquivalent;
        this.description = description;
        this.optionalUnitCount = optionalUnitCount;
    }

    public String getCourseType() {
        return courseType;
    }

    public List<UnitEntity> getMandatoryUnits() {
        return mandatoryUnitEntities;
    }

    public List<UnitEntity> getOptionalUnits() {
        return optionalUnitEntities;
    }

    public Integer getOptionalUnitCount() {
        return optionalUnitCount;
    }

    public Integer getUnitCount() {
        return mandatoryUnitEntities.size() + optionalUnitCount;
    }

    public Integer getGuidedLearningHours() {
        return guidedLearningHours;
    }

    public Integer getMaximumUcasPoints() {
        return maximumUcasPoints;
    }

    public String getaLevelEquivalent() {
        return aLevelEquivalent;
    }

    public String getDescription() {
        return description;
    }
}

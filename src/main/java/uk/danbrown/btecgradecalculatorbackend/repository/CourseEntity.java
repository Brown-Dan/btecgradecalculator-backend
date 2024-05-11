package uk.danbrown.btecgradecalculatorbackend.repository;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.danbrown.btecgradecalculatorbackend.repository.UnitEntity.*;

public enum CourseEntity {
    NATIONAL_CERTIFICATE("National Certificate",
            List.of(FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION),
            emptyList(),
            0),
    NATIONAL_EXTENDED_CERTIFICATE("National Extended Certificate",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN),
            1),
    NATIONAL_FOUNDATION_DIPLOMA("National Foundation Diploma",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION, BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN),
            2),
    NATIONAL_DIPLOMA("National Diploma",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION, BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA, THE_IMPACT_OF_COMPUTING),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN, DIGITAL_AUDIO, DIGITAL_VIDEO, OBJECT_ORIENTED_PROGRAMMING, RELATIONAL_DATABASE_DEVELOPMENT, COMPUTER_NETWORKING, VIRTUALISATION, SYSTEMS_METHODOLOGY), 2),
    NATIONAL_EXTENDED_DIPLOMA("National Extended Diploma",
            List.of(PRINCIPLES_OF_COMPUTER_SCIENCE, FUNDAMENTALS_OF_COMPUTER_SYSTEMS, IT_SYSTEMS_SECURITY_AND_ENCRYPTION, BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA, THE_IMPACT_OF_COMPUTING, SOFTWARE_DESIGN_AND_DEVELOPMENT_PROJECT),
            List.of(HUMAN_COMPUTER_INTERACTION, DIGITAL_GRAPHICS_AND_ANIMATION, COMPUTER_GAMES_DEVELOPMENT, WEBSITE_DEVELOPMENT, MOBILE_APPS_DEVELOPMENT, MANAGING_AND_SUPPORTING_SYSTEMS, SYSTEMS_ANALYSIS_AND_DESIGN, DIGITAL_AUDIO, DIGITAL_VIDEO, OBJECT_ORIENTED_PROGRAMMING, RELATIONAL_DATABASE_DEVELOPMENT, COMPUTER_NETWORKING, VIRTUALISATION, SYSTEMS_METHODOLOGY), 5);

    private final String courseType;
    private final List<UnitEntity> mandatoryUnitEntities;
    private final List<UnitEntity> optionalUnitEntities;
    private final Integer optionalUnitCount;

    CourseEntity(String courseType, List<UnitEntity> mandatoryUnitEntities, List<UnitEntity> optionalUnitEntities, Integer optionalUnitCount) {
        this.courseType = courseType;
        this.mandatoryUnitEntities = mandatoryUnitEntities;
        this.optionalUnitEntities = optionalUnitEntities;
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
}

package uk.danbrown.btecgradecalculatorbackend.repository;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.danbrown.btecgradecalculatorbackend.repository.SubjectEntity.BUSINESS;
import static uk.danbrown.btecgradecalculatorbackend.repository.SubjectEntity.COMPUTING;
import static uk.danbrown.btecgradecalculatorbackend.repository.UnitEntity.*;

public enum CourseEntity {
    // COMPUTING
    NATIONAL_CERTIFICATE_COMPUTING("COMPUTING", "National Certificate",
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
    NATIONAL_EXTENDED_CERTIFICATE_COMPUTING("COMPUTING", "National Extended Certificate",
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
    NATIONAL_FOUNDATION_DIPLOMA_COMPUTING("COMPUTING", "National Foundation Diploma",
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
    NATIONAL_DIPLOMA_COMPUTING("COMPUTING", "National Diploma",
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
    NATIONAL_EXTENDED_DIPLOMA_COMPUTING("COMPUTING", "National Extended Diploma",
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
                                     "computing sector.", 6),
    // BUSINESS
    NATIONAL_CERTIFICATE_BUSINESS("BUSINESS", "National Certificate",
            List.of(EXPLORING_BUSINESS, DEVELOPING_A_MARKETING_CAMPAIGN),
            emptyList(),
            180, 28, "0.5 A Levels", """
            The Certificate offers an
            introduction to a vocational sector
            through applied learning.
            For learners for whom an
            element of business would be
            complementary, the qualification
            supports progression to higher
            education when taken as part of a
            programme of study that includes
            other vocational or general
            qualifications.
            """, 0),
    NATIONAL_EXTENDED_CERTIFICATE_BUSINESS("BUSINESS", "National Extended Certificate",
            List.of(EXPLORING_BUSINESS, DEVELOPING_A_MARKETING_CAMPAIGN, PERSONAL_AND_BUSINESS_FINANCE),
            List.of(RECRUITMENT_AND_SELECTION_PROCESS, INVESTIGATING_CUSTOMER_SERVICE, MARKET_RESEARCH, INVESTIGATING_CUSTOMER_SERVICE, THE_ENGLISH_LEGAL_SYSTEM, WORK_EXPERIENCE_IN_BUSINESS),
            360, 56, "1 A Level", """
                The Extended Certificate is for
                learners who are interested in
                learning about the business sector
                alongside other fields of study, with
                a view to progressing to a wide
                range of higher education courses,
                not necessarily in business-related
                subjects.
                It is designed to be taken as part of
                a programme of study that includes
                other appropriate BTEC Nationals or
                A Levels.
            """, 1),
    NATIONAL_FOUNDATION_DIPLOMA_BUSINESS("BUSINESS", "National Foundation Diploma",
            List.of(EXPLORING_BUSINESS, DEVELOPING_A_MARKETING_CAMPAIGN, PERSONAL_AND_BUSINESS_FINANCE, MANAGING_AN_EVENT),
            List.of(RECRUITMENT_AND_SELECTION_PROCESS, INVESTIGATING_CUSTOMER_SERVICE, MARKET_RESEARCH, INVESTIGATING_CUSTOMER_SERVICE, THE_ENGLISH_LEGAL_SYSTEM, WORK_EXPERIENCE_IN_BUSINESS, RECORDING_FINANCIAL_TRANSACTIONS, COST_AND_MANAGEMENT_ACCOUNTING, INVESTIGATING_RETAIL_BUSINESS, VISUAL_MERCHANDISING, DIGITAL_MARKETING, PITCHING_FOR_A_NEW_BUSINESS, TRAINING_AND_DEVELOPMENT, EMPLOYMENT_LAW, EFFECTIVE_MANAGEMENT_OF_PERSONAL_DEBT, SUPPLY_CHAIN_OPERATIONS),
            510, 84, "1.5 A Levels", """
                The Foundation Diploma is for
                learners looking to study business
                as a one-year, full-time course,
                or for those wishing to take it
                alongside another area of
                contrasting or complementary
                study, as part of a two-year,
                full-time study programme.
                If taken as part of a programme
                of study that includes other BTEC
                Nationals or A Levels it supports
                progression to higher education.
                It also supports progression to an
                Apprenticeship in the business
                sector or to a further year of study
                at Level 3.\s
            """, 2),
    NATIONAL_DIPLOMA_BUSINESS("BUSINESS", "National Diploma",
            List.of(EXPLORING_BUSINESS, DEVELOPING_A_MARKETING_CAMPAIGN, PERSONAL_AND_BUSINESS_FINANCE, MANAGING_AN_EVENT, INTERNATIONAL_BUSINESS, PRINCIPLES_OF_MANAGEMENT),
            List.of(RECRUITMENT_AND_SELECTION_PROCESS, INVESTIGATING_CUSTOMER_SERVICE, MARKET_RESEARCH, INVESTIGATING_CUSTOMER_SERVICE, THE_ENGLISH_LEGAL_SYSTEM, WORK_EXPERIENCE_IN_BUSINESS, RECORDING_FINANCIAL_TRANSACTIONS, COST_AND_MANAGEMENT_ACCOUNTING, INVESTIGATING_RETAIL_BUSINESS, VISUAL_MERCHANDISING, DIGITAL_MARKETING, PITCHING_FOR_A_NEW_BUSINESS, TRAINING_AND_DEVELOPMENT, EMPLOYMENT_LAW, EFFECTIVE_MANAGEMENT_OF_PERSONAL_DEBT, SUPPLY_CHAIN_OPERATIONS, TEAM_BUILDING_IN_BUSINESS, FINANCIAL_STATEMENTS_FOR_SPECIFIC_BUSINESSES, FINAL_ACCOUNTS_FOR_PUBLIC_LIMITED_COMPANIES, INVESTIGATING_CORPORATE_SOCIAL_RESPONSIBILITY, CREATIVE_PROMOTION, ASPECTS_OF_CIVIL_LIABILITY_AFFECTING_BUSINESS, ASPECTS_OF_CRIMINAL_LAW_IMPACTING_ON_BUSINESS_AND_INDIVIDUALS),
            720, 112, "2 A Levels", """
                The Diploma is designed to be the
                substantive part of a 16–19 study
                programme for learners who want
                a strong core of sector study.
                This programme may include other
                BTEC Nationals or A Levels to
                support progression to higher
                education courses in business areas
                before entering employment.
                The additional qualification(s)
                studied allow learners either to give
                breadth to their study programme
                by choosing a contrasting subject,
                or to give it more focus by choosing
                a complementary subject.
                This qualification can also be
                used to progress to Higher
                Apprenticeships.
            """, 2),
    NATIONAL_EXTENDED_DIPLOMA_BUSINESS("BUSINESS", "National Extended Diploma",
            List.of(EXPLORING_BUSINESS, DEVELOPING_A_MARKETING_CAMPAIGN, PERSONAL_AND_BUSINESS_FINANCE, MANAGING_AN_EVENT, INTERNATIONAL_BUSINESS, PRINCIPLES_OF_MANAGEMENT, BUSINESS_DECISION_MAKING),
            List.of(RECRUITMENT_AND_SELECTION_PROCESS, INVESTIGATING_CUSTOMER_SERVICE, MARKET_RESEARCH, INVESTIGATING_CUSTOMER_SERVICE, THE_ENGLISH_LEGAL_SYSTEM, WORK_EXPERIENCE_IN_BUSINESS, RECORDING_FINANCIAL_TRANSACTIONS, COST_AND_MANAGEMENT_ACCOUNTING, INVESTIGATING_RETAIL_BUSINESS, VISUAL_MERCHANDISING, DIGITAL_MARKETING, PITCHING_FOR_A_NEW_BUSINESS, TRAINING_AND_DEVELOPMENT, EMPLOYMENT_LAW, EFFECTIVE_MANAGEMENT_OF_PERSONAL_DEBT, SUPPLY_CHAIN_OPERATIONS, TEAM_BUILDING_IN_BUSINESS, FINANCIAL_STATEMENTS_FOR_SPECIFIC_BUSINESSES, FINAL_ACCOUNTS_FOR_PUBLIC_LIMITED_COMPANIES, INVESTIGATING_CORPORATE_SOCIAL_RESPONSIBILITY, CREATIVE_PROMOTION, ASPECTS_OF_CIVIL_LIABILITY_AFFECTING_BUSINESS, ASPECTS_OF_CRIMINAL_LAW_IMPACTING_ON_BUSINESS_AND_INDIVIDUALS, BRANDING, RELATIONSHIP_MARKETING, LEGAL_PRINCIPLES_AND_PROFESSIONAL_ETHICS_IN_FINANCIAL_SERVICES, BUYING_FOR_BUSINESS, SUPPLY_CHAIN_OPERATIONS, INVESTMENT_OPPORTUNITIES_AND_FINANCIAL_PLANNING, INSURANCE_PRINCIPLES_AND_POLICIES),
            1080, 168, "3 A Levels", """
                The Extended Diploma is a
                two-year, full-time course that
                meets entry requirements in its
                own right for learners who want
                to progress to higher education
                courses in business areas before
                entering employment.
                It can also support learners who
                want to progress directly to
                employment in job roles in business
                or business management and
                Higher Apprenticeships in the
                business sector.
            """, 6);

    private final String subject;
    private final String courseType;
    private final List<UnitEntity> mandatoryUnitEntities;
    private final List<UnitEntity> optionalUnitEntities;
    private final Integer guidedLearningHours;
    private final Integer maximumUcasPoints;
    private final String aLevelEquivalent;
    private final String description;
    private final Integer optionalUnitCount;

    CourseEntity(String subject, String courseType, List<UnitEntity> mandatoryUnitEntities, List<UnitEntity> optionalUnitEntities, Integer guidedLearningHours, Integer maximumUcasPoints, String aLevelEquivalent, String description, Integer optionalUnitCount) {
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }
}

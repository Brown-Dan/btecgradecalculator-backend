package uk.danbrown.btecgradecalculatorbackend.repository;

public enum UnitEntity {
    // COMPUTING
    PRINCIPLES_OF_COMPUTER_SCIENCE("Principles of Computer Science", 120),
    FUNDAMENTALS_OF_COMPUTER_SYSTEMS("Fundamentals of Computer Systems", 90),
    PLANNING_AND_MANAGEMENT_OF_COMPUTING_PROJECTS("Planning and Management of Computing Projects", 120),
    SOFTWARE_DESIGN_AND_DEVELOPMENT_PROJECT("Software Design and Development Project", 120),
    BUILDING_COMPUTER_SYSTEMS("Building Computer Systems", 60),
    IT_SYSTEMS_SECURITY("IT Systems Security", 60),
    IT_SYSTEMS_SECURITY_AND_ENCRYPTION("IT Systems Security and Encryption", 90),
    BUSINESS_APPLICATIONS_OF_SOCIAL_MEDIA("Business Applications of Social Media", 90),
    THE_IMPACT_OF_COMPUTING("The Impact of Computing", 90),
    HUMAN_COMPUTER_INTERACTION("Human-computer Interaction", 60),
    DIGITAL_GRAPHICS_AND_ANIMATION("Digital Graphics and Animation", 60),
    DIGITAL_AUDIO("Digital Audio", 60),
    DIGITAL_VIDEO("Digital Video", 60),
    COMPUTER_GAMES_DEVELOPMENT("Computer Games Development", 60),
    WEBSITE_DEVELOPMENT("Website Development", 60),
    OBJECT_ORIENTED_PROGRAMMING("Object-oriented Programming", 60),
    MOBILE_APPS_DEVELOPMENT("Mobile Apps Development", 60),
    RELATIONAL_DATABASE_DEVELOPMENT("Relational Database Development", 60),
    COMPUTER_NETWORKING("Computer Networking", 60),
    MANAGING_AND_SUPPORTING_SYSTEMS("Managing and Supporting Systems", 60),
    VIRTUALISATION("Virtualisation", 60),
    SYSTEMS_ANALYSIS_AND_DESIGN("Systems Analysis and Design", 60),
    SYSTEMS_METHODOLOGY("Systems Methodology", 60),

    // BUSINESS
    EXPLORING_BUSINESS("Exploring Business", 90),
    DEVELOPING_A_MARKETING_CAMPAIGN("Developing a Marketing Campaign", 90),
    PERSONAL_AND_BUSINESS_FINANCE("Personal and Business Finance", 120),
    MANAGING_AN_EVENT("Managing an Event", 90),
    INTERNATIONAL_BUSINESS("International Business", 90),
    PRINCIPLES_OF_MANAGEMENT("Principles of Management", 120),
    BUSINESS_DECISION_MAKING("Business Decision Making", 120),
    RECRUITMENT_AND_SELECTION_PROCESS("Recruitment and Selection Process", 60),
    TEAM_BUILDING_IN_BUSINESS("Team Building in Business", 60),
    RECORDING_FINANCIAL_TRANSACTIONS("Recording Financial Transactions", 60),
    FINAL_ACCOUNTS_FOR_PUBLIC_LIMITED_COMPANIES("Final Accounts for Public Limited Companies", 60),
    FINANCIAL_STATEMENTS_FOR_SPECIFIC_BUSINESSES("Financial Statements for Specific Businesses", 60),
    COST_AND_MANAGEMENT_ACCOUNTING("Cost and Management Accounting", 60),
    INVESTIGATING_CUSTOMER_SERVICE("Investigating Customer Service", 60),
    INVESTIGATING_RETAIL_BUSINESS("Investigating Retail Business", 60),
    VISUAL_MERCHANDISING("Visual Merchandising", 60),
    DIGITAL_MARKETING("Digital Marketing", 60),
    CREATIVE_PROMOTION("Creative Promotion", 60),
    PITCHING_FOR_A_NEW_BUSINESS("Pitching for a New Business", 60),
    INVESTIGATING_CORPORATE_SOCIAL_RESPONSIBILITY("Investigating Corporate Social Responsibility", 60),
    TRAINING_AND_DEVELOPMENT("Training and Development", 60),
    MARKET_RESEARCH("Market Research", 60),
    THE_ENGLISH_LEGAL_SYSTEM("The English Legal System", 60),
    EMPLOYMENT_LAW("Employment Law", 60),
    ASPECTS_OF_CIVIL_LIABILITY_AFFECTING_BUSINESS("Aspects of Civil Liability Affecting Business", 60),
    ASPECTS_OF_CRIMINAL_LAW_IMPACTING_ON_BUSINESS_AND_INDIVIDUALS("Aspects of Criminal Law Impacting on Business and Individuals", 60),
    WORK_EXPERIENCE_IN_BUSINESS("Work Experience in Business", 60),
    BRANDING("Branding", 60),
    RELATIONSHIP_MARKETING("Relationship Marketing", 60),
    LEGAL_PRINCIPLES_AND_PROFESSIONAL_ETHICS_IN_FINANCIAL_SERVICES("Legal Principles and Professional Ethics in Financial Services", 60),
    EFFECTIVE_MANAGEMENT_OF_PERSONAL_DEBT("Effective Management of Personal Debt", 60),
    BUYING_FOR_BUSINESS("Buying for Business", 60),
    SUPPLY_CHAIN_OPERATIONS("Supply Chain Operations", 60),
    INVESTMENT_OPPORTUNITIES_AND_FINANCIAL_PLANNING("Investment Opportunities and Financial Planning", 60),
    INSURANCE_PRINCIPLES_AND_POLICIES("Insurance Principles and Policies", 60),

    GENERIC_OPTIONAL_UNIT("GENERIC_OPTIONAL_UNIT ", 60);


    private final String name;
    private final Integer guidedLearningHours;

    UnitEntity(String name, Integer guidedLearningHours) {
        this.name = name;
        this.guidedLearningHours = guidedLearningHours;
    }

    public String getName() {
        return name;
    }

    public Integer getGuidedLearningHours() {
        return guidedLearningHours;
    }
}

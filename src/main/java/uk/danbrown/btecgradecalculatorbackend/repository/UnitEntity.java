package uk.danbrown.btecgradecalculatorbackend.repository;

public enum UnitEntity {
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

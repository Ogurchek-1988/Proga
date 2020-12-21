public enum Location {
    UNDERBRIDGE("Under the bridge"),
    POLICEVAN("Policevan"),
    LOSPOGANOS("Los-Poganos"),
    HOLD("Hold"),
    UNKNOWN("Unknown"),
    STUPIDISLAND("Stupid Island"),
    ROCKET("Rocket"),
    CAVE("Cave"),
    SUBLUNARYWORLD("sublunary world"),
    CHERTOVOKOLESO("chertovo koleso"),
    MOON("Moon");
    private final  String name;
    Location(String name){this.name = name;}
    public String getName(){ return name;}
}

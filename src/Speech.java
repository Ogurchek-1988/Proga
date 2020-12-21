public class Speech {
    public String getName() {
        return name;
    }

    private String name;
    private String ability;
    Speech(String name,String ability) {
        this.name = name;
        this.ability = ability;
    }
    public void affects(Sleepwalkers sleepwalkers){
        System.out.println(this.getName() + " affects " + sleepwalkers.getStatus() + " " + sleepwalkers.getName());
    }
}

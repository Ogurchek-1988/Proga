public class Hat {
    private String name;
    private String sate;

    public String getName() {
        return name;
    }

    public String getSate() {
        return sate;
    }

    Hat(String name, String sate) {
        this.name = name;
        this.sate = sate;
    }

    public void was() {
        System.out.println(this.getName() + " was " + this.sate);
    }
}

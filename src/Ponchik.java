public class Ponchik extends Korotishki {
    private Location loc = Location.UNKNOWN;
    private Status status = Status.HUNGRY;
    private String emotion;
    private String ability;
    private String reflections;

    public Ponchik(Location loc, Status status, String name, String emotion, String ability, String reflections) {
        super(loc, status, name);
        this.emotion = emotion;
        this.ability = ability;
        this.reflections = reflections;
    }

    public void eat(Plate plate) {
        System.out.println(getName() + " eat " + plate.getName());
        status = Status.NOTHUNGRY;
    }

    public void told(Korotishki korotishka) {
        System.out.println(this.getName() + " told about " + korotishka.getName() + " that he got on " + Location.STUPIDISLAND.getName());
    }

    public void cry() {
        System.out.println(this.getName() + " " + this.emotion + " cry");
    }

    public void repeating() {
        System.out.println(this.getName() + " kept repeating:'Братцы,братцы'");
    }

    public void recover() {
        System.out.print(this.getName() + " recover from " + Status.SHOCK);
    }

    public void speaks() {
        System.out.println(this.getName() + " speaks like " + Status.NORMAL + " korotishki");
    }

    public void tell() {
        System.out.println(this.getName() + " began to tell:");
    }

    public void ate() {
        System.out.println(this.getName() + " " + this.ability + " ate");
    }

    public void works() {
        System.out.println(this.getName() + " works for " + Location.CHERTOVOKOLESO.getName());
    }

    public void think() {
        System.out.println(this.getName() + " think " + this.reflections);
    }


}


import java.util.Objects;

public abstract class Korotishki {
    private Location location;
    private Status status;
    private String name;

    public Korotishki(String name) {
    }

    public String getName() {
        return this.name;
    }

    public Korotishki(Location loc, Status status, String name) {
        this.location = loc;
        this.status = status;
        this.name = name;

    }

    public void changeLocation(Location location) {
        this.location = location;
        System.out.println(this.getName() + " move " + location);
    }

    public void changeStatus(Status status) {
        this.status = status;
        System.out.println(this.getName() + " change Status to " + status);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        if (this == obj)
            return true;
        Korotishki other = (Korotishki) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void climbed(Korotishki korotishka1, Korotishki korotishka2, Location loc) {
        System.out.println(korotishka1.getName() + " and " + korotishka2.getName() + " climbed in " + loc.getName());
    }

    public void flew(Korotishki korotishka1, Korotishki korotishka2, Location loc) {
        System.out.println(korotishka1.getName() + " and " + korotishka2.getName() + " flew to " + loc.getName());
    }

    public void traveled(Korotishki korotishka1, Korotishki korotishka2, Location loc) {
        System.out.println(korotishka1.getName() + " and " + korotishka2.getName() + " traveled around " + loc.getName());
    }

    public void went(Korotishki korotishka1, Korotishki korotishka2, Location loc) {
        System.out.println(korotishka1.getName() + " and " + korotishka2.getName() + " went to " + loc.getName());
    }

    public void fell(Korotishki korotishka, Location loc) {
        System.out.println(korotishka.getName() + " fell into " + loc.getName());
    }

    public void fate(Korotishki korotishka, Status status) {
        System.out.println(korotishka.getName() + " acquires the status " + status);
    }

}
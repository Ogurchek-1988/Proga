public class Barrel {
    public String getName() {
        return name;
    }

    private String name;
    private String status;
    private Location location;

    Barrel(Location loc, String name, String status) {
        this.name = name;
        location = loc;
        this.status = status;
    }

    public void located() {
        System.out.println(this.status + " " + this.getName() + " located in the middle of " + this.location.getName());
    }
}

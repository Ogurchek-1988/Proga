public class KorotishkiGroupNeznaika extends Korotishki implements Group1{
    private Location loc = Location.UNDERBRIDGE;
    private Status stat = Status.UNHAPPY;

    public KorotishkiGroupNeznaika(Location loc, Status stat, String name) {
        super(loc, stat, name);
    }
    public void sleep(){
        System.out.println(this.getName() + " sleep " + this.loc.getName());
    }
}

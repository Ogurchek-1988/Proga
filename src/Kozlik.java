public class Kozlik extends Korotishki implements Group1{
    private Location loc = Location.UNDERBRIDGE;
    private Status stat = Status.UNHAPPY;
    public Kozlik(Location loc, Status stat, String name){
        super(loc, stat, name);

    }
    public void sleep(){
        System.out.println(this.getName() + " sleep " + this.loc.getName());
    }
    public void stepped(){System.out.println(this.getName() + " stepped aside");}
    public void frowned(){
        System.out.println(this.getName() + " frowned");
    }
}

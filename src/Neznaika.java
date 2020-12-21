public class Neznaika extends Korotishki implements Group1,Group2{
    private Location loc = Location.UNDERBRIDGE;
    private Status stat = Status.UNHAPPY;
    public Neznaika(Location loc, Status stat, String name){
        super(loc, stat, name);

    }
   public void sleep(){
        System.out.println(this.getName() + " sleep " + this.loc.getName());
    }
    public void looked(/*Many many*/){
        System.out.println(this.getName() + " looked at " /*+ many.getName()*/);
   }
   public void cried(){
        System.out.println(this.getName() + " cried");
   }
}

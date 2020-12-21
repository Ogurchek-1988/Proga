public class Shpuntik extends Korotishki implements VintilandShpuntik{
    public Shpuntik(String name){
        super(name);}
    @Override
    public void told() {
        System.out.println(this.getName() + " told:");
    }

}

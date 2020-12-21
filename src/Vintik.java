public class Vintik extends Korotishki implements VintilandShpuntik {
    public Vintik(String name) {
        super(name);
    }

    @Override
    public void told() {
        System.out.println(this.getName() + " told:");
    }

    public void shookout(Korotishki korotishka1, Korotishki korotishka2) {
        System.out.println(this.getName() + " " + korotishka1.getName() + " shook out " + korotishka2.getName());
    }
}

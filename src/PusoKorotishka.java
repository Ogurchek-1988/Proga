public class PusoKorotishka extends Korotishki {
    private String attribute1;
    private String attribute2;
    public PusoKorotishka(Location loc, Status stat, String name, String attribute1, String attribute2) {
        super(loc, stat, name);
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }
    public void climbet(Barrel barrel){
        System.out.println(this.getName() + " ("+ this.attribute1 + ", " + this.attribute2 + ")" + " climbet " + barrel.getName());
    }
    public void consoles(Korotishki korotishka1, Korotishki korotishka2, Korotishki korotishka3, Korotishki korotishka4, Korotishki korotishka5, Korotishki korotishka6, ThreeHundredUnHeppy threeHundredUnHeppy) {
        System.out.println(this.getName() + " consoles " + korotishka1.getName() + " " + korotishka2.getName() + " " + korotishka3.getName() + " " + korotishka4.getName() + " " + korotishka5.getName() + " " + korotishka6.getName() + threeHundredUnHeppy.getName());
        korotishka1.changeStatus(Status.HAPPY);
        korotishka2.changeStatus(Status.HAPPY);
        korotishka3.changeStatus(Status.HAPPY);
        korotishka4.changeStatus(Status.HAPPY);
        korotishka5.changeStatus(Status.HAPPY);
        korotishka6.changeStatus(Status.HAPPY);
        threeHundredUnHeppy.changeStatus(Status.HAPPY);
    }
    public void didnthave(){
        System.out.println(this.getName() + " didn't have " + Garments.SHIRT + " "  + Garments.SHOES);
    }
    public void had(){
        System.out.println(this.getName() + " had " + Garments.HAT + " " + Garments.SCARF);
    }
    public void continued(Speech speech){
        System.out.println(this.getName() + " continued his " + speech.getName());
    }
    public void inserted(){
        System.out.println(this.getName() + " inserted after each word " + Phrases.PHRAS1.getStatus() + " phrases " + Phrases.PHRAS1.getName() + " and " + Phrases.PHRAS2.getName());
    }
}

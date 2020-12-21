public class Police {
    public String getName() {
        return name;
    }

    private String name;

    Police(String name) {
        this.name = name;
    }

    public void arrested(Korotishki korotishka1, Korotishki korotishka2, Korotishki korotishka3, Korotishki korotishka4, Korotishki korotishka5, Korotishki korotishka6) {
        System.out.println(this.getName() + " arrested " + korotishka1.getName() + " " + korotishka2.getName() + " " + korotishka3.getName() + " " + korotishka4.getName() + " " + korotishka5.getName() + " " + korotishka6.getName());
        korotishka1.changeLocation(Location.POLICEVAN);
        korotishka2.changeLocation(Location.POLICEVAN);
        korotishka3.changeLocation(Location.POLICEVAN);
        korotishka4.changeLocation(Location.POLICEVAN);
        korotishka5.changeLocation(Location.POLICEVAN);
        korotishka6.changeLocation(Location.POLICEVAN);
    }

    public void transported(Korotishki korotishka1, Korotishki korotishka2, Korotishki korotishka3, Korotishki korotishka4, Korotishki korotishka5, Korotishki korotishka6) {
        System.out.println(this.getName() + " transported " + korotishka1.getName() + " " + korotishka2.getName() + " " + korotishka3.getName() + " " + korotishka4.getName() + " " + korotishka5.getName() + " " + korotishka6.getName());
        korotishka1.changeLocation(Location.LOSPOGANOS);
        korotishka2.changeLocation(Location.LOSPOGANOS);
        korotishka3.changeLocation(Location.LOSPOGANOS);
        korotishka4.changeLocation(Location.LOSPOGANOS);
        korotishka5.changeLocation(Location.LOSPOGANOS);
        korotishka6.changeLocation(Location.LOSPOGANOS);
    }

    public void put(Korotishki korotishka1, Korotishki korotishka2, Korotishki korotishka3, Korotishki korotishka4, Korotishki korotishka5, Korotishki korotishka6) {
        System.out.println(this.getName() + " put " + korotishka1.getName() + " " + korotishka2.getName() + " " + korotishka3.getName() + " " + korotishka4.getName() + " " + korotishka5.getName() + " " + korotishka6.getName() + " in the " + Location.HOLD.getName());
        korotishka1.changeLocation(Location.HOLD);
        korotishka2.changeLocation(Location.HOLD);
        korotishka3.changeLocation(Location.HOLD);
        korotishka4.changeLocation(Location.HOLD);
        korotishka5.changeLocation(Location.HOLD);
        korotishka6.changeLocation(Location.HOLD);
    }
}

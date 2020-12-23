public class Unknown {
    public String getName() {
        return name;
    }

    private String name;
    private String ability;
    Unknown(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }
    public void brought(Plate platePorridge){
        System.out.println(this.getName() + " " + this.ability + " brought " + platePorridge.getName());
    }
    public void give(Korotishki korotishka){
        System.out.print("give " + korotishka.getName() + " food, then " + korotishka.getName() + " will acquire status " + Status.NORMAL);
    }
    public void sat(Korotishki korotishka, Furniture furniture){
        System.out.println(this.getName() + " sat " + korotishka.getName() + " at the " + furniture.getName());
    }
    public void put(Plate.Porridge plate1, Plate.Borscht plate2, Plate plate, Korotishki korotishka){
        System.out.println(this.getName() + " put " + plate.getName() + " " + plate1 + " and " + plate.getName() + " " + plate2 + " in front of " + korotishka.getName());
    }
}

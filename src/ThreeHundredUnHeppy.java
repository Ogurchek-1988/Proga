
public class ThreeHundredUnHeppy{
    public String getName() {
        return name;
    }
    private String name;
    private Location location;
    private Status status;

    ThreeHundredUnHeppy(Location loc, Status status, String name) {
         this.name = name;
         location = loc;
         this.status = status;
    }
    public void pine(){
        System.out.println(this.getName() + " pine in " + this.location.getName());
    }
    public void changeStatus(Status status){
        this.status = status;
        System.out.println(this.getName() + " change Status to " + status);
    }


    public void cry(int t){
        System.out.println( t + " cry");
    }
    public void looked(int t){
        System.out.println(t + " looked");
    }

}

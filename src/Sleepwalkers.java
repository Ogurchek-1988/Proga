public class Sleepwalkers {
    public String getName() {
        return name;
    }
    public String getStatus(){
        return status;
    }
    private String name;
    private String status;

    Sleepwalkers(String name, String status) {
        this.name = name;
        this.status = status;
    }
    public void changeStatus(){
        this.status = "reassured";
        System.out.println(this.getName() + " change Status to " + this.status);
    }
    public void dontcry(){
        System.out.println(this.getName() + " don't cry");
    }
}

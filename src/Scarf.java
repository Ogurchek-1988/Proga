public class Scarf {
    private String name;
    private String sate;
    private String status;
    public String getName() {
        return name;
    }
    public String getSate() {
        return sate;
    }
    public String getStatus() {
        return status;
    }
    Scarf(String name, String sate, String status){
        this.name = name;
        this.sate = sate;
        this.status = status;
    }
    public void was(){
        System.out.println(this.getName() + " was " + this.sate + ", " + this.status);
    }
}

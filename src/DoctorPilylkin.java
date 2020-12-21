public class DoctorPilylkin {
    public String getName() {
        return name;
    }

    private String name;
    DoctorPilylkin(String name) {
        this.name = name;
    }
    public void told(){
        System.out.println(this.getName() + " told:");
    }
}

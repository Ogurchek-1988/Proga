public class All {
    private String name;
    private Status status;

    public All(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void changeStatus(Status status) {
        this.status = status;
        System.out.println(this.getName() + " change Status to " + status);
    }

    public void spoke() {
        System.out.println(this.getName() + " spoke");
    }
}

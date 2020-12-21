public class Word {
    String name;
    public String getName(){return name;}
    public Word(String name){
        this.name = name;
    }
    public void are(){
        System.out.println(getName() + " are");
    }

}

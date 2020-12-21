public enum Phrases {
    PHRAS1("Поживем -- увидим","favorite"),
    PHRAS2("Сыты будем -- как-нибудь проживем","favorite");
    private final  String name;
    private final String status;
    Phrases(String name,String status){
        this.name = name;
        this.status = status;
    }
    public String getName(){ return name;}
    public String getStatus(){return status;}

}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppRoot {
    @Bean
    public Neznaika neznaika(){return new Neznaika(Location.UNDERBRIDGE, Status.UNHAPPY, "Neznaika");}
    @Bean
    public Kozlik kozlik(){return new Kozlik(Location.UNDERBRIDGE, Status.UNHAPPY, "Kozlik");}
    @Bean
    public KorotishkiGroupNeznaika korotishkiGroupNeznaika(){return new KorotishkiGroupNeznaika(Location.UNDERBRIDGE, Status.UNHAPPY, "korotishkiGroupNezn");}
    @Bean
    public Klykva klykva(){return new Klykva(Location.UNDERBRIDGE, Status.UNHAPPY, "Klykva");}
    @Bean
    public Mizinchik mizinchik(){return new Mizinchik(Location.UNDERBRIDGE, Status.UNHAPPY, "Mizinchik");}
    @Bean
    public Chizhik chizhik(){return new Chizhik(Location.UNDERBRIDGE, Status.UNHAPPY, "Chizhik");}
    @Bean
    public Ponchik ponchik(){return new Ponchik(Location.UNKNOWN, Status.HUNGRY, "Ponchik", "loudly", "fast", "hard");}
    @Bean
    public Plate plate1(){return new Plate("plate");}
    @Bean
    public Plate.Porridge plate2(){return new Plate.Porridge();}
    @Bean
    public Plate.Borscht plate3(){return new Plate.Borscht();}
    @Bean
    public Police police(){return new Police("Police");}
    @Bean
    public ThreeHundredUnHeppy threeHundredUnHeppy(){return new ThreeHundredUnHeppy(Location.HOLD, Status.UNHAPPY, "threeHundredUnHeppy");}
    @Bean
    public Barrel barrel(){return new Barrel(Location.HOLD, "barrel", "empty");}
    @Bean
    public PusoKorotishka pusoKorotishka(){return new PusoKorotishka(Location.HOLD, Status.HAPPY, "Korotishka", "holopusenkyy", "plump");}
    @Bean
    public Scarf scarf(){return new Scarf("Scarf", "woolen", "around the neck");}
    @Bean
    public Hat hat(){return new Hat("Hat", "straw");}
    @Bean
    public Unknown unknown(){return new Unknown("Unknow", "quickly");}
    @Bean
    public Vintik vintik(){return new Vintik("Vintik");}
    @Bean
    public Shpuntik shpuntik(){return new Shpuntik("Shpuntik");}
    @Bean
    public DoctorPilylkin doctorPilylkin(){return new DoctorPilylkin("Doctor Pilylkin");}
    @Bean
    public Move move(){return new Move();}
    @Bean
    public Table table(){return new Table("Table");}
    @Bean
    public Rocket rocket(){return new Rocket("Rocket");}
    @Bean
    public Rocket.Foodreserves foodreserves(){return rocket().new Foodreserves(5);}
    @Bean
    public Speech speech(){return new Speech("speech", "calming");}
    @Bean
    public Sleepwalkers sleepwalkers(){return new Sleepwalkers("Somnambulist", "poor");}
    @Bean
    public All all(){return new All("all", Status.UNHAPPY);}
    @Bean
    public Word words(){ return new Word("words");}

}

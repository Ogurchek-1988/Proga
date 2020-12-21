import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AddConfig.class);
        Word words = ctx.getBean("words", Word.class);

        Neznaika neznaika = new Neznaika(Location.UNDERBRIDGE, Status.UNHAPPY, "Neznaika");
        KorotishkiGroupNeznaika korotishkiGroupNezn = new KorotishkiGroupNeznaika(Location.UNDERBRIDGE, Status.UNHAPPY, "korotishkiGroupNezn");
        Kozlik kozlik = new Kozlik(Location.UNDERBRIDGE, Status.UNHAPPY, "Kozlik");
        Klykva klykva = new Klykva(Location.UNDERBRIDGE, Status.UNHAPPY, "Klykva");
        Mizinchik mizinchik = new Mizinchik(Location.UNDERBRIDGE, Status.UNHAPPY, "Mizinchik");
        Chizhik chizhik = new Chizhik(Location.UNDERBRIDGE, Status.UNHAPPY, "Chizhik");
        Ponchik ponchik = new Ponchik(Location.UNKNOWN, Status.HUNGRY, "Ponchik", "loudly", "fast", "hard");
        PlatePorridge plate = new PlatePorridge("Plate porridge");
        Police police = new Police("Police");
        ThreeHundredUnHeppy threeHundredUnHeppy = new ThreeHundredUnHeppy(Location.HOLD, Status.UNHAPPY, "threeHundredUnHeppy");
        Barrel barrel = new Barrel(Location.HOLD, "barrel", "empty");
        PusoKorotishka pusoKorotishka = new PusoKorotishka(Location.HOLD, Status.HAPPY, "Korotishka", "holopusenkyy", "plump");
        Scarf scarf = new Scarf("Scarf", "woolen", "around the neck");
        Hat hat = new Hat("Hat", "straw");
        Unknown unknown = new Unknown("Unknow", "quickly");
        int t;
        Vintik vintik = new Vintik("Vintik");
        Shpuntik shpuntik = new Shpuntik("Shpuntik");
        DoctorPilylkin doctorPilylkin = new DoctorPilylkin("Doctor Pilylkin");
        Move move = new Move();
        Table table = new Table("Table");
        Plate plate1 = new Plate("plate");
        Plate.Borscht plate2 = new Plate.Borscht();
        Plate.Porridge plate3 = new Plate.Porridge();
        Korotishki kr = new Korotishki("") {
            @Override
            public String getName() {
                return super.getName();
            }
        };
        Rocket rocket = new Rocket("Rocket");
        Rocket.Foodreserves foodreserves = rocket.new Foodreserves(5);
        Speech speech = new Speech("speech", "calming");
        Sleepwalkers sleepwalkers = new Sleepwalkers("Somnambulist", "poor");
        All all = new All("all", Status.UNHAPPY);

        class Time {
            int time;
            String dimension;

            Time(int time, String dimension) {
                this.time = time;
                this.dimension = dimension;
            }

            int randomTimePass() {
                this.time = (int) (Math.random() * (60.0 - 5.0) + 1.0);
                return this.time;
            }

            int timePass(int timePass) {
                this.time += timePass;
                return this.time;
            }

            String changeTimeDimension(String dimension) {
                this.dimension = dimension;
                return this.dimension;
            }
        }
        Time time = new Time(0, "секунд");

        vintik.told();
        shpuntik.told();
        vintik.shookout(shpuntik, ponchik);
        ponchik.cry();
        ponchik.repeating();
        ponchik.changeStatus(Status.FORGET);
        words.are();
        doctorPilylkin.told();
        System.out.print("'");
        ponchik.recover();
        System.out.print(" and ");
        ponchik.speaks();
        unknown.give(ponchik);
        System.out.println("'");
        move.movement1();
        move.choice1();
        move.vvod();
        try {
            move.check(unknown, ponchik, table);
        } catch (NameCheck nameCheck) {
            System.out.println(nameCheck.getMessage());
        } finally {
            unknown.put(plate2, plate3, plate1, ponchik);
        }
        ponchik.ate();
        ponchik.tell();
        System.out.print("'");
        kr.climbed(ponchik, neznaika, Location.ROCKET);
        kr.flew(ponchik, neznaika, Location.MOON);
        kr.traveled(ponchik, neznaika, Location.MOON);
        kr.went(ponchik, neznaika, Location.CAVE);
        kr.fell(neznaika, Location.SUBLUNARYWORLD);
        ponchik.changeStatus(Status.LONELINESS);

        for (int i = 1; i <= 6; i++) {
            System.out.println(foodreserves);
            if (foodreserves.kol == 0) {
                kr.fell(ponchik, Location.SUBLUNARYWORLD);
            }
            foodreserves.kol = foodreserves.kol - 1;
        }
        ponchik.changeLocation(Location.SUBLUNARYWORLD);
        ponchik.changeLocation(Location.LOSPOGANOS);
        ponchik.fate(ponchik, Status.WEALTHY);
        ponchik.fate(ponchik, Status.PENNILESS);
        ponchik.works();
        ForAdept adept = new ForAdept() {
            @Override
            public void joined(String question) throws StatusCheck {
                if (question == "yes")
                    System.out.println(ponchik.getName() + " joined the society of free spinners");
                else
                    throw new StatusCheck(ponchik.getName() + " NOT joined the society of free spinners. End of the Story");
            }
        };
        adept.joined("yes");
        ponchik.think();
        ponchik.tell();


        System.out.println(" ");
        unknown.brought(plate);
        ponchik.eat(plate);
        ponchik.told(neznaika);
        neznaika.sleep();
        korotishkiGroupNezn.sleep();
        klykva.sleep();
        kozlik.sleep();
        mizinchik.sleep();
        chizhik.sleep();
        police.arrested(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNezn);
        police.transported(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNezn);
        police.put(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNezn);
        threeHundredUnHeppy.pine();

        t = (int) (Math.random() * 100 + 200);
        threeHundredUnHeppy.looked(t);
        threeHundredUnHeppy.cry(t);

        neznaika.looked();
        neznaika.cried();
        pusoKorotishka.climbet(barrel);
        barrel.located();
        pusoKorotishka.consoles(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNezn, threeHundredUnHeppy);
        pusoKorotishka.didnthave();
        pusoKorotishka.had();
        scarf.was();
        hat.was();
        kozlik.changeStatus(Status.PAINED);
        kozlik.stepped();
        pusoKorotishka.continued(speech);
        pusoKorotishka.inserted();
        speech.affects(sleepwalkers);
        sleepwalkers.changeStatus();
        sleepwalkers.dontcry();
        all.changeStatus(Status.HAPPY);
        all.spoke();
        kozlik.frowned();

        Korotishki k = new KorotishkaUnKnow("Korot");
        if (k.getClass() == KorotishkaUnKnow.class) {
            System.out.println("KorotishkaUnKnow");
        } else if (k.getClass() == Ponchik.class) {
            System.out.println("Ponchik");
        }

    }
}

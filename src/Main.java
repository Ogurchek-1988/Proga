import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppRoot.class);
        Word words = ctx.getBean(Word.class);
        Neznaika neznaika = ctx.getBean(Neznaika.class);
        Kozlik kozlik = ctx.getBean(Kozlik.class);
        KorotishkiGroupNeznaika korotishkiGroupNeznaika = ctx.getBean(KorotishkiGroupNeznaika.class);
        Klykva klykva = ctx.getBean(Klykva.class);
        Mizinchik mizinchik = ctx.getBean(Mizinchik.class);
        Chizhik chizhik = ctx.getBean(Chizhik.class);
        Ponchik ponchik = ctx.getBean(Ponchik.class);
        Plate plate1 = ctx.getBean(Plate.class);
        Plate.Porridge plate2 = ctx.getBean(Plate.Porridge.class);
        Plate.Borscht plate3 = ctx.getBean(Plate.Borscht.class);
        Police police = ctx.getBean(Police.class);
        ThreeHundredUnHeppy threeHundredUnHeppy = ctx.getBean(ThreeHundredUnHeppy.class);
        Barrel barrel = ctx.getBean(Barrel.class);
        PusoKorotishka pusoKorotishka = ctx.getBean(PusoKorotishka.class);
        Scarf scarf = ctx.getBean(Scarf.class);
        Hat hat = ctx.getBean(Hat.class);
        Unknown unknown = ctx.getBean(Unknown.class);
        Vintik vintik = ctx.getBean(Vintik.class);
        Shpuntik shpuntik = ctx.getBean(Shpuntik.class);
        DoctorPilylkin doctorPilylkin = ctx.getBean(DoctorPilylkin.class);
        Move move = ctx.getBean(Move.class);
        Table table = ctx.getBean(Table.class);
        Rocket.Foodreserves foodreserves = ctx.getBean(Rocket.Foodreserves.class);
        Speech speech = ctx.getBean(Speech.class);
        Sleepwalkers sleepwalkers = ctx.getBean(Sleepwalkers.class);
        All all = ctx.getBean(All.class);
        int t;

        Korotishki kr = new Korotishki("") {
            @Override
            public String getName() {
                return super.getName();
            }
        };

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
        ForAdept adept = new ForAdept(){
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
        unknown.brought(plate1);
        ponchik.eat(plate1);
        ponchik.told(neznaika);
        neznaika.sleep();
        korotishkiGroupNeznaika.sleep();
        klykva.sleep();
        kozlik.sleep();
        mizinchik.sleep();
        chizhik.sleep();
        police.arrested(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNeznaika);
        police.transported(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNeznaika);
        police.put(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNeznaika);
        threeHundredUnHeppy.pine();

        t = (int) (Math.random() * 100 + 200);
        threeHundredUnHeppy.looked(t);
        threeHundredUnHeppy.cry(t);

        neznaika.looked();
        neznaika.cried();
        pusoKorotishka.climbet(barrel);
        barrel.located();
        pusoKorotishka.consoles(neznaika, kozlik, klykva, mizinchik, chizhik, korotishkiGroupNeznaika, threeHundredUnHeppy);
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

    }
}

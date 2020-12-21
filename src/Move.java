import java.util.Scanner;
public class Move {
    public int s1, s2;

    void movement1() {
        System.out.println("Выбирите действие: So it actually happened?");
    }

    void choice1() {
        System.out.println("yes(1) or no(2)");
    }

    void vvod() {
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextInt();
    }
    void check(Unknown unknown,Ponchik ponchik,Table table) throws NameCheck{
        if (s1==1){
            unknown.sat(ponchik, table);
        } else if (s1==2){
            ponchik.cry();
        }else {
            throw new NameCheck("pls choose 1 or 2");
        }

    }

    void vvod2() {
        Scanner scanner = new Scanner(System.in);
        s2 = scanner.nextInt();
    }
}

public class Rocket {
    public String getName() {
        return name;
    }

    private String name;

    Rocket(String name) {
        this.name = name;
    }

    public class Foodreserves { //вложенный класс
        int kol;

        public Foodreserves(int kol) {
            this.kol = kol;
        }
        @Override
        public String toString() {
            return "Food reserves{" +
                    "kol=" + kol +
                    '}';
        }
    }
}

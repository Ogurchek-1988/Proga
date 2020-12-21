public class Plate {
    private String name;

    public String getName() { //вложенный статический класс
        return this.name;
    }

    public Plate(String name) {
        this.name = name;
    }

    public static class Borscht {
        @Override
        public String toString() {
            return "borscht";
        }
    }

    public static class Porridge {
        @Override
        public String toString() {
            return "porridge";
        }
    }
}
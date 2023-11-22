package lab7;

public class Taks2_1 {
    interface Coffee {
        void brew();
    }

    static class EnglishCoffee implements Coffee {
        @Override
        public void brew() {
            System.out.println("Brewing English Coffee");
        }
    }

    static class SpanishCoffee implements Coffee {
        @Override
        public void brew() {
            System.out.println("Brewing Spanish Coffee");
        }
    }

    static abstract class CoffeeMaker {
        abstract Coffee createCoffee();

        // Другие методы
        void serveCoffee() {
            Coffee coffee = createCoffee();
            coffee.brew();
            System.out.println("Serve the coffee.");
        }
    }

    static class EnglishCoffeeMaker extends CoffeeMaker {
        @Override
        Coffee createCoffee() {
            return new EnglishCoffee();
        }
    }

    static class SpanishCoffeeMaker extends CoffeeMaker {
        @Override
        Coffee createCoffee() {
            return new SpanishCoffee();
        }
    }

    public static void main(String[] args) {
        CoffeeMaker englishCoffeeMaker = new EnglishCoffeeMaker();
        englishCoffeeMaker.serveCoffee();

        CoffeeMaker spanishCoffeeMaker = new SpanishCoffeeMaker();
        spanishCoffeeMaker.serveCoffee();
        }

}

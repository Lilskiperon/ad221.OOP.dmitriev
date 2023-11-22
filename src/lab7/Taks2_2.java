package lab7;

public class Taks2_2 {
    static abstract class Pizza {
        void prepare() {
            System.out.println("Preparing pizza");
        }

        void bake() {
            System.out.println("Baking pizza");
        }

        void cut() {
            System.out.println("Cutting pizza");
        }

        void box() {
            System.out.println("Boxing pizza");
        }
    }

    static class NYCheesePizza extends Pizza {
        @Override
        void prepare() {
            System.out.println("Preparing NY style cheese pizza");
        }
    }

    static class NYPepperoniPizza extends Pizza {
        @Override
        void prepare() {
            System.out.println("Preparing NY style pepperoni pizza");
        }
    }

    static class NYSpecialPizza extends Pizza {
        @Override
        void prepare() {
            System.out.println("Preparing NY special pizza");
        }
    }

    static class ChicagoCheesePizza extends Pizza {
        @Override
        void prepare() {
            System.out.println("Preparing Chicago style cheese pizza");
        }
    }

    static class ChicagoPepperoniPizza extends Pizza {
        @Override
        void prepare() {
            System.out.println("Preparing Chicago style pepperoni pizza");
        }
    }

    static class ChicagoVeggiePizza extends Pizza {
        @Override
        void prepare() {
            System.out.println("Preparing Chicago style veggie pizza");
        }
    }

    interface PizzaStore {
        Pizza orderPizza(String pizzaType);
        Pizza createPizza(String pizzaType);
    }

    static class NYPizzaStore implements PizzaStore {
        @Override
        public Pizza orderPizza(String pizzaType) {
            Pizza pizza = createPizza(pizzaType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            return pizza;
        }

        @Override
        public Pizza createPizza(String pizzaType) {
            if ("cheese".equals(pizzaType)) {
                return new NYCheesePizza();
            } else if ("pepperoni".equals(pizzaType)) {
                return new NYPepperoniPizza();
            } else if ("special".equals(pizzaType)) {
                return new NYSpecialPizza();
            }

            return null;
        }
    }

    static class ChicagoPizzaStore implements PizzaStore {
        @Override
        public Pizza orderPizza(String pizzaType) {
            Pizza pizza = createPizza(pizzaType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            return pizza;
        }

        @Override
        public Pizza createPizza(String pizzaType) {
            if ("cheese".equals(pizzaType)) {
                return new ChicagoCheesePizza();
            } else if ("pepperoni".equals(pizzaType)) {
                return new ChicagoPepperoniPizza();
            } else if ("veggie".equals(pizzaType)) {
                return new ChicagoVeggiePizza();
            }

            return null;
        }
    }

        public static void main(String[] args) {
            PizzaStore nyPizzaStore = new NYPizzaStore();
            nyPizzaStore.orderPizza("cheese");

            PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
            chicagoPizzaStore.orderPizza("veggie");
        }
}
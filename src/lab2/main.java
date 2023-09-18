package lab2;

public class main {
    public class Item {
        private final String name; // найменування товару
        private float price; // ціна товару

        // Конструктор класу "Товар" з параметрами
        public Item(String name, float price) {
            this.name = name;
            if (price < 0) {
                this.price = 0; // Якщо передана від'ємна ціна, встановлюємо 0
            } else {
                this.price = price;
            }
        }

        // Метод для підвищення ціни на певний відсоток
        public void increasePrice(float percent) {
            if (percent > 0) {
                price += (price * percent / 100);
            }
        }

        // Метод для зниження ціни на певний відсоток
        public void decreasePrice(float percent) {
            if (percent > 0) {
                price -= (price * percent / 100);
                if (price < 0) {
                    price = 0; // Якщо після зниження ціна стала від'ємною, встановлюємо 0
                }
            }
        }

        // для отримання найменування товару
        public String getName() {
            return name;
        }

        // для отримання ціни товару
        public float getPrice() {
            return price;
        }
    }
    public class Cart {
        private Item[] stack; // Масив для реалізації стеку
        private int top; // Індекс верхнього елементу стеку
        private int maxSize; // Максимальна кількість елементів у стеку

        // Конструктор класу "Кошик" з параметром максимальної кількості елементів у стеку
        public Cart(int maxSize) {
            this.maxSize = maxSize;
            this.stack = new Item[maxSize];
            this.top = -1; // Початково стек порожній
        }

        // Метод для додавання товару до стеку
        public void addItem(Item item) {
            if (top < maxSize - 1) {
                top++;
                stack[top] = item;
            } else {
                System.out.println("Помилка: Кошик переповнений");
            }
        }

        // Метод для видалення товару зі стеку
        public void removeItem() {
            if (top >= 0) {
                top--;
            } else {
                System.out.println("Помилка: Кошик порожній");
            }
        }

        // Метод для підрахунку суми цін товарів у кошику
        public float calculateTotalPrice() {
            float total = 0;
            for (int i = 0; i <= top; i++) {
                total += stack[i].getPrice();
            }
            return total;
        }

        // Метод для підвищення цін усіх товарів у стеку на певний відсоток
        public void increasePrices(float percent) {
            for (int i = 0; i <= top; i++) {
                stack[i].increasePrice(percent);
            }
        }

        // Метод для зниження цін усіх товарів у стеку на певний відсоток
        public void decreasePrices(float percent) {
            for (int i = 0; i <= top; i++) {
                stack[i].decreasePrice(percent);
            }
        }
    }




}


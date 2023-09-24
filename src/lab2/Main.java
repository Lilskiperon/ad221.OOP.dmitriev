package lab2;

import java.util.LinkedList;
import java.util.Queue;
public class Main{
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Заповнюємо кошик об'єктами класу Item
        Item item1 = new Item("Молоко", 100);
        Item item2 = new Item("Хліб", 25);
        Item item3 = new Item("Мука", 150);
        Item item4 = new Item("Риба", 300);
        Item item5 = new Item("Сухарики", 50);
        Item item6 = new Item("М'ясо", 250);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);

        // Виводимо суму цін товарів усередині кошика
        float totalPrices = cart.calculateTotalPrice();
        System.out.println("Сума цін товарів у кошику: " + totalPrices);

        // Піднімаємо ціни в кошику на 15%
        cart.increasePrices(15);

        // Виводимо змінену суму цін на консоль
        float totalAfterIncrease = cart.calculateTotalPrice();
        System.out.println("Сума цін товарів у кошику після підвищення: " + totalAfterIncrease);

        // Знижуємо ціни в кошику на 30%
        cart.decreasePrices(30);

        // Виводимо змінену суму цін на консоль
        float totalAfterDecrease = cart.calculateTotalPrice();
        System.out.println("Сума цін товарів у кошику після зниження: " + totalAfterDecrease);

    }
    public static class Item {
        private String name; // найменування товару
        private float price; // ціна товару


        public Item(String name, float price) { // Конструктор класу "Товар"
            this.name = name;
            if (price < 0) {
                this.price = 0; // Якщо передана від'ємна ціна, встановлюємо 0
            } else {
                this.price = price;
            }
        }

        // Підвищення ціни на певний відсоток
        public void increasePrice(float percent) {
            if (percent > 0) {
                price += (price * percent / 100);
            }
        }

        // Зниження ціни на певний відсоток
        public void decreasePrice(float percent) {
            if (percent > 0) {
                price -= (price * percent / 100);
                if (price < 0) {
                    price = 0; // Якщо після зниження ціна стала від'ємною, встановлюємо 0
                }
            }
        }

        // Отримання найменування товару
        public String getName() {
            return name;
        }

        // Отримання ціни товару
        public float getPrice() {
            return price;
        }
    }
    public static class Cart {
        private Queue<Item> queue; // Використовуємо чергу для зберігання товарів

        // Конструктор класу "Кошик" з параметром максимальної кількості елементів у черзі
        public Cart() {
            this.queue = new LinkedList<>();
        }

        // Додавання товару до черги (кошика)
        public void addItem(Item item) {
            queue.offer(item); // Додаємо товар в кінець черги
        }

        // Видалення товару з початку черги (кошика)
        public void removeItem() {
            if (!queue.isEmpty()) {
                queue.poll(); // Видаляємо перший елемент (перший доданий товар)
            } else {
                System.out.println("Помилка: Кошик порожній");
            }
        }

        // Підрахунку суми цін товарів у кошику
        public float calculateTotalPrice() {
            float total = 0;
            for (Item item : queue) {
                total += item.getPrice();
            }
            return total;
        }

        // Підвищення цін усіх товарів у кошику на певний відсоток
        public void increasePrices(float percent) {
            for (Item item : queue) {
                item.increasePrice(percent);
            }
        }

        // Зниження цін усіх товарів у кошику на певний відсоток
        public void decreasePrices(float percent) {
            for (Item item : queue) {
                item.decreasePrice(percent);
            }
        }
    }

}


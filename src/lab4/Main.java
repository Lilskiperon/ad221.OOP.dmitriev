package lab4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        regularBill regularCustomerBill = new regularBill();
        System.out.println("Постійний клієнт:");
        // Товари до рахунку зі знижками для постійного клієнта
        regularCustomerBill.addItem(new Item("Краби", 100.0, 15.0));
        regularCustomerBill.addItem(new Item("Огірки", 50.0, 10.5));
        regularCustomerBill.addItem(new Item("Риба", 250.0, 25.5));
        regularCustomerBill.addItem(new Item("Груші", 40.0, 0.0)); //  товар без знижки
        regularCustomerBill.addItem(new Item("Мандарини", 80.0, 0.0)); //  товар без знижки

        regularCustomerBill.printBill();

        UsualBill loyalCustomerBill = new UsualBill();
        System.out.println("Звичайний клієнт:");
        // Товари до рахунку зі знижками
        loyalCustomerBill.addItem(new Item("Краби", 100.0, 15.0));
        loyalCustomerBill.addItem(new Item("Огірки", 50.0, 10.5));
        loyalCustomerBill.addItem(new Item("Риба", 250.0, 25.5));
        loyalCustomerBill.addItem(new Item("Груші", 40.0, 0.0)); //  товар без знижки
        loyalCustomerBill.addItem(new Item("Мандарини", 80.0, 0.0)); //  товар без знижки

        loyalCustomerBill.printBill();
    }
    static class Item {
        private String name;
        private double price;
        private double discount;

        public Item(String name, double price, double discount) {
            this.name = name;
            this.price = price;
            this.discount = discount;
        }

        public double getDiscountedPrice() {
            return price - discount;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public double getDiscount() {
            return discount;
        }
    }

    public static class UsualBill extends regularBill{
        public void addItem(Item item){
            items.add(new Item(item.getName(), item.getPrice(), 0.0));
        }
    }
    public static class regularBill{

        public List<Item> items;

        public regularBill() {
            this.items = new ArrayList<>();
        }
        public void addItem(Item item) {
                items.add(item);
        }
        public List<Item> getItems() {
            return items;
        }
        public double calculateTotal() {
            double total = 0.0;
            for (Item item : items) {
                total += item.getDiscountedPrice();
            }
            return total;
        }
        public void printBill() {
            double totalDiscount = 0;
            double totalAmount = 0;

            for (Item item : items) {
                double itemDiscount = item.getDiscount(); // Знижка для постійного клієнта
                double discountedPrice = item.getPrice() - itemDiscount;

                totalAmount += discountedPrice;
                totalDiscount += itemDiscount;

                System.out.println("Товар: " + item.getName() + ", Ціна: " + item.getPrice() + " грн, " +
                        "Знижка: " + itemDiscount + " грн, " +
                        "Сума зі знижкою: " + discountedPrice + " грн");
            }

            System.out.println("Сума кошика: " + totalAmount + " грн");
            System.out.println("Сума знижки: " + totalDiscount + " грн");
        }
    }

}

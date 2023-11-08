package lab6.carshop.cars;

public class Truck extends Car {
    int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // Скидка 10%
        } else {
            return regularPrice;
        }
    }
}

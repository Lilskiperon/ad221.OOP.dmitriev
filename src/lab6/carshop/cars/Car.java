package lab6.carshop.cars;

public abstract class Car {
    int speed;
    public boolean isSellOut;
    double regularPrice;
    public String color;

    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public abstract double getSalePrice();
}

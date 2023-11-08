package lab6.carshop.cars;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice - manufacturerDiscount; // Цена минус скидка производителя
    }

}


package lab6.carshop.Interfaces;

public interface Customer {
    double getCarsPrice();

    String getCarColors();

    double getCarPrice(int id);

    String getCarColor(int id);

    void purchaseCar(int id);
}

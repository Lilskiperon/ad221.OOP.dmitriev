package lab6.carshop.impl;

import lab6.carshop.Interfaces.Accumulator;
import lab6.carshop.Interfaces.Admin;
import lab6.carshop.Interfaces.Customer;
import lab6.carshop.cars.Car;
import lab6.carshop.cars.Ford;
import lab6.carshop.cars.Sedan;
import lab6.carshop.cars.Truck;

public class MyOwnAutoShop implements Admin, Customer {
    Car[] cars = new Car[5];

    public MyOwnAutoShop() {
        cars[0] = new Sedan(150, true, 190000, "Grey", 22);
        cars[1] = new Ford(100, false, 200000, "Blue", 2021, 1000);
        cars[2] = new Ford(110, true, 170000, "Red", 2023, 500);
        cars[3] = new Truck(120, false, 255000, "White", 3200);
        cars[4] = new Truck(120, true, 220000, "Green", 2600);
    }

    public double getIncome() {
        double income = 0;
        for (Car car : cars) {
            if (car.isSellOut) {
                income += car.getSalePrice();
            }
        }
        return income;
    }


    public double getCarsPrice() {
        double total = 0;
        for (Car car : cars) {
            total += car.getSalePrice();
        }
        return total;
    }

    public String getCarColors() {
        StringBuilder colors = new StringBuilder();
        for (Car car : cars) {
            colors.append(car.color).append(", ");
        }
        return colors.substring(0, colors.length() - 2);
    }



    public double getCarPrice(int id) {
        return cars[id].getSalePrice();
    }

    public String getCarColor(int id) {
        return cars[id].color;
    }


    public void purchaseCar(int id) {
        cars[id].isSellOut = true;
    }
    public class PrimeAccumulator implements Accumulator {
        private boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        @Override
        public int fold(int[] arr) {
            int count = 0;
            for (int n : arr) {
                if (isPrime(n)) count++;
            }
            return count;
        }
    }

    public class NonPrimeAccumulator implements Accumulator {
        private boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        @Override
        public int fold(int[] arr) {
            int count = 0;
            for (int n : arr) {
                if (!isPrime(n)) count++;
            }
            return count;
        }
    }
}


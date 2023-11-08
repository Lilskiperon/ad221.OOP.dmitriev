package lab6.carshop;

import lab6.carshop.impl.MyOwnAutoShop;
import lab6.carshop.Interfaces.Accumulator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //-----------------------1---------------------
        System.out.println("-----------------------1---------------------");
        MyOwnAutoShop shop = new MyOwnAutoShop();

        System.out.println("Цвета автомобилей в магазине: " + shop.getCarColors());
        System.out.println("Общая стоимость автомобилей в магазине: " + shop.getCarsPrice());

        System.out.println("Цена автомобиля с ID 1: " + shop.getCarPrice(1));
        System.out.println("Цвет автомобиля с ID 1: " + shop.getCarColor(1));

        shop.purchaseCar(1);
        System.out.println("Автомобиль с ID 1 куплен");
        System.out.println("Доход от продажи автомобилей: " + shop.getIncome());
        //-----------------------2---------------------
        System.out.println("-----------------------2---------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Accumulator primeAccumulator = new Accumulator.PrimeAccumulator();
        Accumulator nonPrimeAccumulator = new Accumulator.NonPrimeAccumulator();

        int primeCount = primeAccumulator.fold(arr);
        int nonPrimeCount = nonPrimeAccumulator.fold(arr);

        System.out.println("Количество простых чисел: " + primeCount);
        System.out.println("Количество непростых чисел: " + nonPrimeCount);
    }
}
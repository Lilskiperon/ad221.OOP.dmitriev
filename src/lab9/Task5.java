package lab9;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int N = 10;
        List<Car> cars = generateCars(N);

        int overtakes = countOvertakes(cars);
        System.out.println("Кількість обгонів: " + overtakes);
    }
    static class Car {
        int position;
        int speed;

        public Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }

    private static List<Car> generateCars(int N) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int position = (int) (Math.random() * 10000) + 10;
            int speed = (int) (Math.random() * 200) + 10;
            cars.add(new Car(position, speed));
        }
        return cars;
    }

    private static int countOvertakes(List<Car> cars) {
        int overtakes = 0;
        int n = cars.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Якщо швидкість другого автомобіля більше, а його положення менше, ніж у першого, то це обгін
                if (cars.get(j).speed > cars.get(i).speed && cars.get(j).position < cars.get(i).position) {
                    overtakes++;
                }
            }
        }

        return overtakes;
    }
}

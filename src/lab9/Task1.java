package lab9;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = generateRandomArray(100, -1000, 1000);

        sortingArray(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        }
        return array;
    }

    private static void sortingArray(int[] array) {
        int positiveIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                int temp = array[i];
                for (int j = i; j > positiveIndex; j--) {
                    array[j] = array[j - 1];
                }
                array[positiveIndex] = temp;
                positiveIndex++;
            }
        }
    }
}

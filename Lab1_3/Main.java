import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int length=0;

        while(length<2) {                                       //Проверка на длину массива
            System.out.println("Enter array length 2 or more:");
            length=s.nextInt();
        }

        int[]array = new int[length];

        System.out.println("Array:");

        for(int i=0; i<length;i++){                             //Ввод данных массива
            array[i]=s.nextInt();
        }

        System.out.println(canSplitArray(array));
    }
    private static boolean canSplitArray(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {                                //Если общая сумма нечетная, то нельзя разделить массив на две части с одинаковой суммой
            return false;
        }

        int targetSum = totalSum / 2;
        return canPartition(nums, 0, 0, targetSum);

    }
    private static boolean canPartition(int[] nums, int currentIndex, int currentSum, int targetSum) {
        int length = nums.length;
        if (currentSum == targetSum) {
            return true;
        }

        if (currentIndex == nums.length || currentSum > targetSum || currentIndex>(length/2)) {
            return false;
        }

        return canPartition(nums,currentIndex + 1, currentSum + nums[currentIndex], targetSum);  // Выбираем текущий элемент в текущую часть или не включаем его
    }
}

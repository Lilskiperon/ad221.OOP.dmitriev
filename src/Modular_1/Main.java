package Modular_1;
public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10000000; i <= 99999999; i += 1) {
            if(i%12345==0) {                    // Перевірка, чи число діляться на 12 345 без залишку
                if (!repeatDigits(Integer.toString(i))) {
                    count++;
                    System.out.println(i);
                }
            }
        }

        System.out.println("Загальна кількість знайдених слов:" + count);
    }
     static boolean repeatDigits(String s) {    //Метод, який перевіряє чи є півторення цифр
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
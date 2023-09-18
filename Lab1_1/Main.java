import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length=0;
        while(length<2) {                       //Проверка на длину массива
            System.out.println("Enter array length 2 or more:");
            length=s.nextInt();
        }

        int[]array = new int[length];

        System.out.println("Array:");
        for(int i=0; i<length;i++){             //Ввод данных массива
            array[i]=s.nextInt();
        }

        boolean result = isSorted(array,length);       //Вызываем функцию isSorted
        System.out.println(result);             //Выводим результат

    }

    private static boolean isSorted(int [] array,int length){
        boolean flag = false;

        for (int i=1; i<length;i++){
            if(array[i-1]<=array[i]){           //Сравниваем текущий элемент с предыдущим
                flag=true;                      //Если текущий элемент больше или равен предыдущему, устанавливаем флаг в true
            }

            else{
                flag=false;                     //Если текущий элемент меньше предыдущего, устанавливаем флаг в false и выходим из цикла
                break;
            }
        }
    return flag;                                //Возвращаем значение флага
    }

}
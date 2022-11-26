import java.util.Scanner;
/*Напишите функцию monneub,  которая принимает как аргумент массив целых чисел//
 и находит длину максимального монотонно
не убывающего промежутка и выведите её на экран. Содержание функции main менять запрещено.*/
//             1 2 3 1 3 4 5 1 1 3
public class Monotonous_non_decreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);


    }

    static void monneub(int[] mas){
        int[] array = { 1, 2, 3, 0, 4, 5, 6, 7 };


            int countMax = 0;
            int countNow = 0;

            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] < array[i + 1])
                {
                    countNow++;
                }
                else
                {
                    countNow = 0;
                }

                if (countNow > countMax)
                    countMax = countNow;
            }
        System.out.println(countMax);



    }
}

import java.util.Scanner;


public class Area_and_perimeter {
    /*Необходимо написать программу для поиска площади и периметра квадрата или круга.
    Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число (либо радиус круга, либо сторону квадрата).
     Как результат они выводят периметр и площадь фигуры соответственно.
    В ответ они должны вывести именно целое число (при надобности округлять "вверх", то есть до ближайшего большего целого числа).
     Содержание функции main менять запрещено. Пи брать как 3.14.*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }
    static void perimeter (String figure, int x ){
    if("Круг".equals(figure)){
        System.out.println((int) Math.ceil(Math.PI * Math.pow(x, 2)));
    }
    else {
        System.out.println((int) Math.ceil(Math.PI * x * 2));
     }
       // int result= (int)Math.floor(P);
        //System.out.println(P);
    }
   static void area(String figure, int x ){
       if ("Круг".equals(figure)){
           System.out.println((int) Math.ceil(Math.PI * Math.pow(x, 2)));
       }
       else{
           System.out.println((int) Math.ceil(x * x));
       }
   }
}

import java.util.Scanner;
class Example_three {
    /*Площадь треугольника можно вычислить по формуле Герона. Напишите функцию geron,
    которая по трём действительным числам находит площадь треугольника и выводит её на экран.
     Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует".
    Содержимое функции main менять запрещено.*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }
    static void geron(double s1, double s2,double s3){
        double p= (s1+s2+s3)/2;
        double Sfake=p*(p-s1)*(p-s2)*(p-s3);
     double S =Math.sqrt(Sfake);
        System.out.print(S>0?S:"Такого треугольника не существует");


    }
}

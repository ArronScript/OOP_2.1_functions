import java.util.Scanner;

public class Prime_numbers_on_the_interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }

    static void simpleAB(int x, int y){
        for (int i = x; i <= y; i++) {
            if(i>3&&(i%3==0||i%2==0)){
            System.out.println(i+" - составное");
        }
        else if(i >= -1 && i <= 1){
            System.out.println(i+ " - "+ i);
        }
        else {
            System.out.println(i+" - простое");
        }







        }




    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        multiply(a, b, c);

    }
    static void multiply(int a, int b, int c ){
        int z;
        z=a*b*c;
        System.out.println(z);
    }

}
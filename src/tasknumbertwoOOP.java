import java.util.Scanner;


class tasknumbertwoOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }

    static void twoWords(String s1, String s2){
        int s11=s1.length();
        int s22=s2.length();
        if(s22>s11) System.out.println("Вторая строка длиннее");
        if(s22<s11) System.out.println("Первая строка длиннее");
        if(s22==s11) System.out.println("Равная длина");
    }
}

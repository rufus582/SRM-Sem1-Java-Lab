import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 Integers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a>b && a>c) {
            System.out.println(a+" is greatest");
        } else if(b>a && b>c) {
            System.out.println(b+" is the greatest");
        } else if (c>a && c>b) {
            System.out.println(c+" is greatest");
        } else {
            System.out.println("All are equal!");
        }

        in.close();
    }
}

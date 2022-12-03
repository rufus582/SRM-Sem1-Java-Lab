import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        while ((num = sc.nextInt()) > 0) {
            System.out.println("You have entered "+num);
            System.out.println("Enter a Number:");
        }
        sc.close();
        System.out.println("Exiting...");
    }
}

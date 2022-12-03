import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        float temp = in.nextFloat();
        temp = (temp * (9f/5)) + 32;
        System.out.println(temp+" deg Fahrenheit");
        in.close();
    }
}

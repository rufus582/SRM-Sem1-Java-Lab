import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        float temp = in.nextFloat();
        temp = ((temp - 32) * 5) / 9;
        System.out.println(temp+" deg Celsius");
        in.close();
    }
}

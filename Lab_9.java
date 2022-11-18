import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_9 {
    public static void main(String[] args) {
        double a=0, b=0, c=0;
        boolean valid = false;

        Scanner in = new Scanner(System.in);

        while(!valid) {
            try {
                System.out.println("Enter a value for A");
                a = in.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format, please try again.");
                valid = false;
                in.next();
            }
        }
        valid = false;

        while(!valid) {
            try {
                System.out.println("Enter a value for B");
                b = in.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format, please try again.");
                valid = false;
                in.next();
            }
        }
        valid = false;

        while(!valid) {
            try {
                System.out.println("Enter a value for C");
                c = in.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format, please try again.");
                valid = false;
                in.next();
            }
        }
        valid = false;

        double res = Math.pow(b, 2) - (4 * a * c);

        if (res >= 0) {
            double sol1 = (-b + Math.sqrt(res)) / (2 * a);
            double sol2 = (-b - Math.sqrt(res)) / (2 * a);

            System.out.println("Solution 1: "+sol1+"\nSolution2: "+sol2);
        } else {
            System.out.println("Roots are indeterminate");
        }

        in.close();
    }
}

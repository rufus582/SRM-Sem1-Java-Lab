import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int marks;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks out of 100:");
        marks = in.nextInt();

        if (marks > 40) {
            System.out.println("Congrats, you've PASSED!!!");
        } else {
            System.out.println("You have FAILED!!! Sed lyf :(");
        }

        in.close();
    }
}

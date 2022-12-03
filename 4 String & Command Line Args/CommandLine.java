public class CommandLine {
    public static void main(String[] args) {
        int sum = 0;
        try {
            sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers as the first two args and try again!!!");
            System.exit(1);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("The sum is: "+sum);
    }
}

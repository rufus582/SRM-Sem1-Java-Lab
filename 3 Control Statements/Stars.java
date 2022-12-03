public class Stars {
    public static void main(String[] args) {
        Stars s = new Stars();

        //Stars on the Left (simplest)
        s.starsLeft(10);

        //Stars on the Right
        s.starsRight(10, "*");

        //Stars centered
        s.starsRight(10, "* ");
        
    }

    public void starsLeft(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starsRight(int num, String star) {
        for(int i = (num - 1); i >= 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}

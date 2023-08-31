package homework1;

public class FigurePainter {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println();
        {
            for (int i = 0; i < 5; i++) {
                for (int k = 4; k >= i; k--) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            System.out.println();
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i - 1; k++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= (5 - i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= (4 - i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i - 1; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (5 - i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (3 - i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            }
        }

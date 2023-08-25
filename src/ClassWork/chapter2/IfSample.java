package ClassWork.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x is less then y");
            {
                x = x * 2;
                if (x == y) System.out.println("x equal y");
            }
            x = x * 2;
            if (x > y) {
                System.out.println("x its big y ");
            }
        }
    }
}
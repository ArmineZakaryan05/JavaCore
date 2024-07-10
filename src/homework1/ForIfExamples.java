package homework1;

public class ForIfExamples {
    public static void main(String[] args) {

        for (int x = 1; x < 11; x++) {
            System.out.print(" " + x);
        }
        System.out.println();
        System.out.println();


        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println();


        for (int y = 50; y > 0; y--) {
            System.out.print(" " + y);
        }
        System.out.println();
        System.out.println();


        for (int z = 1; z < 20; z = z + 2) {
            System.out.print(" " + z);
        }
        System.out.println();
        System.out.println();


        int count = 0;
        for (int a = 2; a < 100; a = a + 2) {
            count = count + 1;
        }
        System.out.println(" " + count);

    }
}
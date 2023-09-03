package homework1;

public class ForExamples {
    public static void main(String[] args) {
        int i =0;
        for ( i = 1; i <= 1000; i++) {
            System.out.print(" - ");
            System.out.print(i);
        }
            System.out.println();
            System.out.println();

            for (int k = 1; k <= 100; k++) {
                if (k % 2 == 0) {
                    System.out.println(k);
                }
            }
        System.out.println();
        System.out.println();

        int[] array = {2,5,8,4,9,3,7};

        int max = array [0];
        for (int j=0;j<array.length;j++){
            if (array[j] > max){
                max = array[j];
            }
        }
        System.out.println("max: " + max);
        }
    }

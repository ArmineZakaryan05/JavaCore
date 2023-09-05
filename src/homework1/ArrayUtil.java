package homework1;

public class ArrayUtil {
    public static void main(String[] args) {

        //1
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println();

//2
        int i = numbers[0];
        System.out.println(i);

        System.out.println();
        System.out.println();


        //3

          int k = numbers [8];
          System.out.println(k);

        System.out.println();
        System.out.println();

        //  4

        System.out.print( numbers.length );

        System.out.println();
        System.out.println();

        //5

        int min = numbers [0];
        for (int j=0;j<numbers .length;j++){
            if (numbers [j] < min){
                min =numbers  [j];
            }
        }
        System.out.println("min :" + min);

        System.out.println();
        System.out.println();

//6
        int y = numbers [4];
        System.out.println(y);


        System.out.println();
        System.out.println();


        //7

        for(int j = 0; j<numbers.length;j++){
            if(numbers[j]%2==0) {
                System.out.print(numbers[j] + " ");
            }
        }
        System.out.println();
        System.out.println();

        //8

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 != 0) {
                System.out.print(numbers[x]+ " ");
            }
        }

        System.out.println();
        System.out.println();

        //9

        double result = 0;
        for ( i = 0; i <numbers.length; i++)
            result = result + numbers [ i ];
        System.out.println(
                "  " + result ) ;


        System.out.println();
        System.out.println();


        //10
        for ( i = 9; i <=numbers.length; i++)
           // result = result + numbers [ i ];
        System.out.println("  " + result / numbers.length) ;
    }
}

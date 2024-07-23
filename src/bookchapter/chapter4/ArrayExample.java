package bookchapter.chapter4;

public class ArrayExample {
    public static void main(String[] args) {

        int[] numbers = {3, 55, 43, 1, 8, 9, 6, 33, 6};

//int length = numbers.length;
//        System.out.println(numbers[length-1]);

//         int max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);
//    }

       // System.out.println(numbers[0]);

        for (int i = 0; i < 9; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
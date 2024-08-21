package homework;

public class Sort {
    public static void main(String[] args) {


        int[] array = {4, 7, 1, 3, 9, 0, 2};
//ex.1
        //
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < array[i]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }

        //ex.2
        for (
                int x : array) {
            System.out.print(x + " ");

        }

        for (int i = 0;
             i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        System.out.println();
        for (
                int x : array) {
            System.out.print(x + " ");

        }
    }
}
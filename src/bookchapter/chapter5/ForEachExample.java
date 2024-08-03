package bookchapter.chapter5;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 2, 1, 7};
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        for (int x : array) { // x-ը մասիվի մեջի արժեքներն են հերթ.
//            sum += x;
//        }
//        System.out.println(sum);
//        for (int i = 0; i < array.length; i++) {   //մասիվի էլեմենտները տպելու համար
//            System.out.println(array[i]);
//        }
        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}

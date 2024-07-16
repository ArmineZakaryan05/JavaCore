package homework1;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //ex.1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //ex.2
        System.out.println(numbers[0]);

        //ex.3
        int length = numbers.length;
        System.out.println(numbers[length - 1]);

        //ex.4
        System.out.println(numbers.length + " ");


        //ex.5
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        // ex.6
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
            return;
        }
        int mid = numbers.length / 2;
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[mid]);
        }
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[mid - 1] + " " + numbers[mid]);
        }

        //ex.7
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


        //ex.8
        int count1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count1++;
            }
        }
        System.out.println(count1);

        //ex.9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        //ex.10
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];

        }
        System.out.println(result / numbers.length);
    }
}


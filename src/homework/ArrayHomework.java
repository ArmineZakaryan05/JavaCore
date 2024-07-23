package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 6, 8, 6, 7, 1, 6, 2};
        //ex.1
        int n = 6;
        int count = 0;
        for (int num : numbers) {
            if (num == n) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();

        //ex.2
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        //ex.3
        int duplicateCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }
        System.out.println(duplicateCount);
        System.out.println();

        //ex.4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'է', 'ը', 'ի', 'յ', 'ո', 'օ'};
        int count1 = 0;
        for (char c : chars) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    count1++;
                    break;
                }
            }
        }
        System.out.println(count1);


//        String text = "բարևաշխարհ";
//        String vowels = "աեէըիյոուօ";
//        int count1 = 0;
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if (vowels.indexOf(c) >= 0) {
//                count1++;
//            }
//        }
//        System.out.println(count1);
    }
}
package bookchapter.classwork.stringBuilderExample;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("count: ");
        for (int i = 0; i < 50; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
package bookchapter.classwork.stringExampl;

public class StringExample {

    public static void main(String[] args) {
        String name = "Poxos";
        String name1 = new String("Poxos");

        String name2 = "Poxos";

        name = name + "ik";
        System.out.println(name1.equals(name2));
    }
}

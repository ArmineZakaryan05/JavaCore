package classwork;

public class ArgsExample {

    public static void main(String[] args) {
        String calculatorType = "Standard";
        if (args.length > 0) {
            calculatorType = args[0];
        }
        System.out.println(calculatorType);
    }
}

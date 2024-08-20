package bookchapter.chapter7;

public class Overload {
    public static void main(StringExample[] args) {

        OverloadDemo ob = new OverloadDemo();
        int i = 88;
       // double result;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
       // result = ob.test(123.25);
       // System.out.println("Result of ob.test(123.25): " + result);
    }
}

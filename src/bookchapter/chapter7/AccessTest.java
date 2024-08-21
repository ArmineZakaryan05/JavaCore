package bookchapter.chapter7;

import bookchapter.chapter7.Test2;

public class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        ob.a = 10;
        ob.b = 20;

        ob.setc(100);
        System.out.println("a, b and c: " + ob.a + " " +
                ob.b + " " + ob.getc());
    }
}

package bookchapter.classwork.innerClass;

public class A {
    int x = 5;

    private static class B {
        int y = 10;
    }

    public void print() {
        B b = new B();
    }
}

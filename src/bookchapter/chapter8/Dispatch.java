package bookchapter.chapter8;

public class Dispatch {
    public static void main(String[] args) {
        DynamicA a = new DynamicA();
        DynamicB b = new DynamicB();
        DynamicC c = new DynamicC();

        DynamicA r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}

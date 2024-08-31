package classwork.inheritance;

public class ABTest {

    public static void main(String[] args) {
        A a = new A(5,9);
        a.i = 10;
        a.showI();

        B b = new B(3,8);
        b.i = 9;
        b.showI();
        b.k = 6;
        b.showK();

        A ref = new B(1,3);

    }
}

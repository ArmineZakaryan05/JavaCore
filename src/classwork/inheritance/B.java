package classwork.inheritance;

public class B extends A {

    public int k;

    B(int i, int j) {
        super(i, j);
    }

    public void showK() {
        System.out.println("k -> " + k);
    }

}

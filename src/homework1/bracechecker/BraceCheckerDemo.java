package homework1.bracechecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String a = "))h{ello world ]]";
        BraceChecker bc = new BraceChecker(a);
        bc.check();
    }
}

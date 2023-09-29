package homework1.bracechecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String s = "))(h{ello world ]]";
        BraceChecker bc = new BraceChecker(s);
        bc.check();
    }
}

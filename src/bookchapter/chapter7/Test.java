package bookchapter.chapter7;

public class Test {
   int a, b;
Test(int i, int j){
    a = i;
    b = j;
}


    public void meth(Test o) {
        o.a *= 2;
        o.b /= 2; }


//    boolean equalTo(Test o) {
//        if (o.a == a && o.b == b) {
//            return true;
//        } else return false;
//    }
}

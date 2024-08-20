package bookchapter.chapter7;

public class Outer {
    int outerX = 100;

    void test(){
        Inner inner = new Inner();
    inner.display();
    }

    class  Inner{
        void display(){
            System.out.println("display: outerX = " + outerX);
        }
     }


}

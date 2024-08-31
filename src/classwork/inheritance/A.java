package classwork.inheritance;

public class A {

    public  int i;
    public int j;

    A(int i, int j){
        this.i = i;
        this.j = j;
    }

    A(){

    }


    public void showI(){
        System.out.println("i -> " + i);
    }

    public void showJ(){
        System.out.println("j -> "+ j);
    }
}

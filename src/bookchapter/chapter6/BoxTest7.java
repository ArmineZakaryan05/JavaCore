package bookchapter.chapter6;

public class BoxTest7 {
    public static void main(String[] args) {
        Box mybox1 = new Box (10, 20, 15,"red");
        Box mybox2 = new Box(3, 6, 9,"green");

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);

    }
}

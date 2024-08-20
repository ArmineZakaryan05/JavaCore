package bookchapter.chapter6;

public class BoxTest6 {
    public static void main(String[] args) {

        Box mybox1 = new Box(12,23,34,"with");
        Box mybox2 = new Box(12,25,89,"red");

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

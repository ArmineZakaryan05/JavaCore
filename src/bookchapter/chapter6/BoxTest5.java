package bookchapter.chapter6;

public class BoxTest5 {
    public static void main(String[] args) {
        Box mybox1 = new Box(3,3,3,"blue");
        Box mybox2 = new Box(4,4,4,"blue");
        double vol;

//        mybox1.setDim(10, 20, 15);
//        mybox2.setDim(3, 6, 9);

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

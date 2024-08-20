package bookchapter.chapter6;

public class BoxTest3 {
    public static void main(String[] args) {
        Box mybox1 = new Box(1,1,1,"blue");
        Box mybox2 = new Box(2,2,2,"blue");

//        mybox1.width = 10;
//        mybox1.height = 20;
//        mybox1.depth = 15;
//
//        mybox2.width = 3;
//        mybox2.height = 6;
//        mybox2.depth = 9;

        //display volume of first box
        mybox1.volume();

        //display volume of second box
        mybox2.volume();
    }
}

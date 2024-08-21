package bookchapter.chapter7;

import bookchapter.chapter7.Box;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 30);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        Box myClone = new Box(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);


        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

      //  vol = mycube.volume();
      //  System.out.println("Volume of cube is " + vol);

        vol = myClone.volume();
        System.out.println("Volume of clone is " + vol);
    }


}
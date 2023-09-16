package chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 3;
        myBox1.height = 6;
        myBox1.depth = 9;

        vol = myBox1.volume();
        System.out.println("Oбъeм равен " + vol);

        vol = myBox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}

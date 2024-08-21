package bookchapter.classwork.staticExample;

public class Box {

    public static String madeIn = "Made in Armenia";

    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    static {
        System.out.println("Hi from static block in Boc");
    }

    double volume() {
        return width * height * depth;
    }

    public  static  void printMadeIn(){

      //  System.out.println(width);//error: width is not static
        System.out.println(madeIn);
    }
}

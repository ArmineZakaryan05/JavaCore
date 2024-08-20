package bookchapter.chapter7.finalExample;

public class Box {

    double width;
    double height;
    double depth;

//    Box() {
//        System.out.println("Constructing Box");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }

    double volume() {
        return width * height * depth;
    }

    Box(double width, double height, double depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
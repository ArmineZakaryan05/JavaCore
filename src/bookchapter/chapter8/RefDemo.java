package bookchapter.chapter8;


public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        plainbox = weightBox;

        vol = plainbox.volume();
        System.out.println("Volume of plainBox is " + vol);
        //System.out.println("Weight of plainBox is" + plainbox.weight);
    }
}

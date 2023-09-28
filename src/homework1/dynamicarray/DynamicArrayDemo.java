package homework1.dynamicarray;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        dy.add(6);
        dy.add(7);
        dy.add(8);
        dy.add(9);
        dy.add(5);
        System.out.println(dy.getIndexByValue(6));
    }
}
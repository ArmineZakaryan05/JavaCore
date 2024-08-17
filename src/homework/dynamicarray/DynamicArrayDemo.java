package homework.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(6);
        dy.add(7);
        dy.add(9);
        dy.add(8);
        dy.add(2);
        dy.add(13);
        dy.add(19);
        dy.add(21);
        dy.add(20);
        dy.print();
        System.out.println();
        dy.getByIndex(2);
        dy.deleteByIndex(1);
        dy.print();
        dy.set(3, 60);
        dy.print();
        dy.add(9, 87);
        dy.print();
        System.out.println(dy.exists(87));
        System.out.println(dy.exists(78));
        System.out.println(dy.getIndexByValue(0));


    }
}
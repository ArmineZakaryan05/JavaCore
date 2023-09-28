package homework1.dynamicarray;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void add (int index, int value){
        if (index < 0 || index >= size){
            System.out.println("Wrong Index");
            return;
        }

        if(size == array.length){
            extend();
        }
        for (int i = size - 1 ; i >= index ; i--) {
            array[i + 1 ] = array[i];
        }
        array [index] = value;
        size ++;
    }

    boolean exists (int value){
        for (int i = 0; i < size; i++) {
           if(array [i] == value){
               return true;
           }
        }
        return false;
    }

    int getByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return 0;
        }
        return array[index];

    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }


     void deleteByIndex(int index) {
        if (index < 0 || index >= size){
            System.out.println("Wrong Index");
            return;
        }
         for (int i = index + 1; i < size; i++) {
             array[ i - 1 ] = array[i];
         }
         size--;
    }

void set (int index, int value) {
    if (index < 0 || index >= size) {
        System.out.println("Wrong Index");
        return;
    }
    array[index ] = value;
}

int getIndexByValue(int value){
    for (int i = 0; i < size; i++) {
        if(array[i] == value){
            return i;
        }
    }
    return - 1;
}

  void print(){
      for (int i = 0; i <size ; i++) {
          System.out.print(array[i] + " ");
      }
      System.out.println();
  }

}
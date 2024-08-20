package bookchapter.chapter7;

public class Stack1 {
    private int[] Stack;
    private int tos;

    Stack1(int size) {
        Stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == Stack.length - 1) {
            System.out.println("Stack is full.");
        } else
            Stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return Stack[tos--];
    }

}

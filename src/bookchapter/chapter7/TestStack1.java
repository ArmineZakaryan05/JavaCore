package bookchapter.chapter7;

import bookchapter.chapter7.Stack1;

public class TestStack1 {
    public static void main(String[] args) {
        Stack1 myStack1 = new Stack1(5);
        Stack1 myStack2 = new Stack1(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.println("Stack1 in myStack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Stack1 in myStack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}

package homework1.bracechecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("error at " + i + ":closed" + c + "but not opened");
                    } else if (last != '(') {
                        System.err.println("Error at" + i + ":closed" + c + "but opened" + last);
                    }
                    break;

                case '}':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("error at " + i + ":closed" + c + "but not opened");
                    } else if (last != '{') {
                        System.err.println("Error at" + i + ":closed" + c + "but opened" + last);
                    }
                    break;

                case ']':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("error at " + i + ":closed" + c + "but not opened");
                    } else if (last != '[') {
                        System.err.println("Error at" + i + ":closed" + c + "but opened" + last);
                    }
                    break;
            }
        }
        char last;
        while ((last = (char) stack.pop()) != 0){
            System.err.println("error :  opened " + last  + " but not closed " );
        }
    }
}
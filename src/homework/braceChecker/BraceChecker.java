package homework.braceChecker;


public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        if (text == null) {
            System.out.println("Text cannot be null");
        }
        this.text = text;
    }

    public BraceChecker() {

    }

    public void check() {
        Stack myStack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            switch (c) {
                case '{':
                case '[':
                case '(':
                    myStack.push(new Brace(c, i));
                    break;

                case '}':
                    Brace pop = myStack.pop();
                    if (pop == null) {
                        System.err.println("Error: Closed " + c + "  but not opened at  " + " " + i);
                    } else {
                        char brace = pop.brace;
                        int index = pop.index;
                        if (brace != '{') {
                            System.err.println("Error: Closed " + c + " but opened " + " " + brace + " at  " + " " + index);
                        }
                    }
                    break;
                case ']':
                    pop = myStack.pop();
                    if (pop == null) {
                        System.err.println("Error: Closed " + " " + c + " " + " but not opened at " + i);
                    } else {
                        char brace = pop.brace;
                        int index = pop.index;
                        if (brace != '[') {
                            System.err.println("Error: Closed " + " " + c + " " + " but opened " + brace + " " + " at " + index);
                        }
                    }
                    break;
                case ')':
                    pop = myStack.pop();
                    if (pop == null) {
                        System.err.println("Error: Closed " + " " + c + " " + " but not opened at " + " " + i);
                    } else {
                        char brace = pop.brace;
                        int index = pop.index;
                        if (brace != '(') {
                            System.err.println("Error: Closed " + " " + c + " " + " but opened " + " " + brace + " " + " at " + index);
                        }
                    }
                    break;
            }

        }
//        int last;
//        while ((last = myStack.pop()) != 0) {
//            System.err.println("Error: Opened " + " " + (char) last + " " + "but not closed.");
//        }
        while (!myStack.isEmpty()) {
            Brace brace = myStack.pop();
            System.err.println("Error: Opened " + " " + brace.brace + " " + brace.index + " " + "but not closed.");
        }
    }

    public void text(String s) {
    }
}

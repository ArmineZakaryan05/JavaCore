package homework.braceChecker;


public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.tos < 0) {
                        System.err.println("Error: closed " + c + i + " but not opened.");
                        break;
                    }
                    char top = (char) stack.pop();
                    if ((c == '}' && top != '{') ||
                            (c == ']' && top != '[') ||
                            (c == ')' && top != '(')) {
                        System.err.println("Error: opened " + top + " but  " + c + " " + i);
                    } else {
                        System.out.println("Opened " + top + " and closed " + c + " " + i);
                    }
                    break;
            }
        }
    }
}

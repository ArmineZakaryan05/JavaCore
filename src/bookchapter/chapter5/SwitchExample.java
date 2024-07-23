package bookchapter.chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        String language = "ENG";
        switch (language) {
            case "HY":
                System.out.println("Բարև");
                break;
            case "RU":
                System.out.println("Привет");
                break;
            case "ENG":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Unsupported language");
        }
    }
}

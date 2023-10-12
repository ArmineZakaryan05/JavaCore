package ClassWork.library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassWork.library.BookStorage bookStorage = new ClassWork.library.BookStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Place input 0 for EXIT");
            System.out.println("Place input 1 for ADD BOOK");
            System.out.println("Place input 2 for SEARCH BOOK");
            System.out.println("Place input 3 for PRINT ALL BOOKS");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case"1":
                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input author name");
                    String authorName = scanner.nextLine();
                    System.out.println("Pleace input price");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input count ");
                    int  count = Integer.parseInt(scanner.nextLine());
                    ClassWork.library.Book book = new ClassWork.library.Book(title, authorName, price,count);
                    bookStorage.add(book);
                    System.out.println("Book created!");
                    break;
                case"2":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case "3":
                    System.out.println("____________________________");
                    bookStorage.print();
                    System.out.println("____________________________");
                    break;
                default:
                    System.out.println("Invalid command. Try again");
            }
        }
    }
}



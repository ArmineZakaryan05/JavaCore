package homework.bookStorage;

import java.util.Scanner;

public class Library {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_NAME = "3";
    private static final String UPDATE_BOOK = "4";
    private static final String SEARCH_BOOK_BY_PRICE_RANGE = "5";
    private static final String DELETE_BOOK_BY_ID = "6";


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_NAME:
                    searchBookByName();
                    break;
                case UPDATE_BOOK:
                    updateBook();
                    break;
                case SEARCH_BOOK_BY_PRICE_RANGE:
                    searchBookByPriceRange();
                    break;
                case DELETE_BOOK_BY_ID:
                    deleteBookById();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }


    private static void deleteBookById() {
        bookStorage.print();
        System.out.println("Pleas input book ID");
        String bookId = scanner.nextLine();
        if (bookStorage.deleteBookById(bookId)) {
            System.out.println("Book with ID " + bookId + " was deleted.");
        } else {
            System.err.println("Book with ID " + bookId + " was not found.");
        }

    }


    private static void updateBook() {
        bookStorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookById(bookId);
        if (bookById != null) {
            System.out.println("Please input book's new title");
            String title = scanner.nextLine();
            System.out.println("Please input author's new name ");
            String authorName = scanner.nextLine();
            System.out.println("Please input book's new price ");
            String priceStr = scanner.nextLine();
            if (title != null && !title.isEmpty()) {
                bookById.setTitle(title);
            }
            if (authorName != null && !authorName.isEmpty()) {
                bookById.setAuthorName(authorName);
            }
            if (priceStr != null && !priceStr.isEmpty()) {
                bookById.setPrice(Double.parseDouble(priceStr));
            }
            System.out.println("Update was successfully");

        }
    }

    private static void searchBookByPriceRange() {
        System.out.println("Please input minimum price:");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input maximum price:");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.searchBookByPriceRange(minPrice, maxPrice);
    }

    private static void searchBookByName() {
        System.out.println("Please input book keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByBookName(keyword);
    }

    private static void addBook() {
        System.out.println("Please input book id");
        String id = scanner.nextLine();
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input author's name ");
        String authorName = scanner.nextLine();
        System.out.println("Please input book price ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book's quantity ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Book book = new Book(id, title, authorName, price, quantity);
        Book bookById = bookStorage.getBookById(id);
        if (bookById == null) {
            bookStorage.add(book);
            System.out.println("Book added!");
        } else {
            System.err.println("Book with " + id + " already exists! ");
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT_ALL_BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_NAME + " for SEARCH_BOOK_BY_NAME");
        System.out.println("Please input " + UPDATE_BOOK + " for UPDATE_BOOK ");
        System.out.println("Please input " + SEARCH_BOOK_BY_PRICE_RANGE + " for SEARCH_BOOK_BY_PRICE_RANGE");
        System.out.println("Please input " + DELETE_BOOK_BY_ID + " for DELETE_BOOK_BY_ID");

    }
}

package ClassWork.library;

public class BookStorage {

    private ClassWork.library.Book[] books = new ClassWork.library.Book[10];
    private int size;

    public void add (ClassWork.library.Book book){
        if(size == books.length){
            extend();
        }
        books[size++] = book;
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " + books[i].getPrice() + " " + books[i].getCount());

        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword) ||
                    books[i].getAuthorName().contains(keyword)) {
                System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " + books[i].getPrice() + " " + books[i].getCount());

            }
        }
    }

    private void extend(){
        ClassWork.library.Book[] tmp = new ClassWork.library.Book[books.length + 10];
        System.arraycopy(books,0, tmp, 0, books.length);
        books = tmp;
    }
}
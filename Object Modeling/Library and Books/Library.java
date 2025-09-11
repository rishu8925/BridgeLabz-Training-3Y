import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<Book> books; 

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }


    public void showLibraryBooks() {
        System.out.println("\nLibrary: " + name + " has the following books:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}



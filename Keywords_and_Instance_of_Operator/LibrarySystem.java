class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid object.");
        }
    }

    String getIsbn() {
        return isbn;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");

        Book.displayLibraryName();
        System.out.println();

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();

        System.out.println("Book 1 ISBN: " + book1.getIsbn());
        System.out.println("Book 2 ISBN: " + book2.getIsbn());
    }
}


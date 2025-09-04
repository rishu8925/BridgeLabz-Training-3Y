
public class BookMain {
    public static void main(String[] args) {
        BookMain defaultBook = new BookMain();
        defaultBook.displayDetails();
        Book customBook = new Book("Atomic Habits", "James Clear", 15.99);
        customBook.displayDetails();
    }
}

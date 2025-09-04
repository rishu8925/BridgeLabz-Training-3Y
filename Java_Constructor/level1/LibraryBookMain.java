public class LibraryBookMain {
     public static void main(String[] args) {
       
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 15.99, true);
        book1.displayDetails();

        book1.borrowBook();
        book1.displayDetails();

        
        book1.borrowBook();

       
        book1.returnBook();
        book1.displayDetails();
    }
}

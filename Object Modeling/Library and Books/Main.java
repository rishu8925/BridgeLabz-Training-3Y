// import yourpackage.Book;
// import yourpackage.Library;
public class Main {
    public static void main(String[] args) {
       
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        
        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Community Library");

        
        lib1.addBook(book1);
        lib1.addBook(book2);

        lib2.addBook(book2); 
        lib2.addBook(book3);

       
        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}


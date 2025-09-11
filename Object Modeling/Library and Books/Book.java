// public class Book {
//     String title;
//     String author;

//     public Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void displayBook() {
//         System.out.println("Book: " + title + " | Author: " + author);
//     }
// }

public class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
     public void displayBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}



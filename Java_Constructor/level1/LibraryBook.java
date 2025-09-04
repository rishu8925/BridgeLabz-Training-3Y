public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;  
    
    public LibraryBook() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.available = true;
    }

   
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

   
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("You have returned \"" + title + "\". Thank you!");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

  
    public void displayDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}

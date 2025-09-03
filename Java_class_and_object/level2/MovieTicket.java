public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("🎟️ Ticket booked successfully!");
        } else {
            System.out.println("❌ Ticket already booked.");
        }
    }

    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("📽️ Movie: " + movieName);
            System.out.println("🪑 Seat: " + seatNumber);
            System.out.printf("💰 Price: ₹%.2f%n", price);
        } else {
            System.out.println("⚠️ No ticket booked yet.");
        }
    }
}


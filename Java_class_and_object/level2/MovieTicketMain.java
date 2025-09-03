public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Jawan");
        ticket.displayTicketDetails();
        ticket.bookTicket("A12", 250.00);
        ticket.displayTicketDetails();
        ticket.bookTicket("B15", 300.00);
    }
}


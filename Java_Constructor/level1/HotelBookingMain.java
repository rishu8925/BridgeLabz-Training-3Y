public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.displayDetails();
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        booking2.displayDetails();
    }
}

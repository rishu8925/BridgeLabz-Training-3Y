public class CarRentalMain {
    public static void main(String[] args) {
       
        CarRental rental1 = new CarRental();
        rental1.displayDetails();

      
        CarRental rental2 = new CarRental("Alice Johnson", "Toyota Camry", 5, 75.0);
        rental2.displayDetails();

        
        CarRental rental3 = new CarRental(rental2);
        rental3.displayDetails();
    }
}

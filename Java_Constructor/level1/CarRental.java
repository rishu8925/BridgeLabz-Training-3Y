public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;  
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Car";
        this.rentalDays = 1;
        this.dailyRate = 50.0; 
    }
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays > 0 ? rentalDays : 1; // validation
        this.dailyRate = dailyRate > 0 ? dailyRate : 50.0;
    }
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void displayDetails() {
        System.out.println("\n--- Car Rental Details ---");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Daily Rate    : $" + dailyRate);
        System.out.println("Total Cost    : $" + calculateTotalCost());
    }
}


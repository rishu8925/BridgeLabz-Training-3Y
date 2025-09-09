class Vehicle {
    static double registrationFee = 100.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to $" + registrationFee);
    }

    void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid object.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "REG001");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorbike", "REG002");

        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(120.0);
        System.out.println();

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}


package InstancesVsClass;

public class Vehicle {
    String ownerName;
    String vehicleType;

    
    private static double registrationFee = 1000.0; 

   
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("\nRegistration fee updated to: $" + registrationFee);
        } else {
            System.out.println("\nInvalid registration fee!");
        }
    }
}


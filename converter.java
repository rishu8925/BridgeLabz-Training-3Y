import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Display result
        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }
}

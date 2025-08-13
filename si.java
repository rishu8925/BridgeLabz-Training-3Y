import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of interest (% per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest is: " + simpleInterest);

        scanner.close();
    }
}

package level1;


import java.util.Scanner;

public class SICalculator {

    
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double timePeriod = scanner.nextDouble();

        SICalculator calculator = new SICalculator();

        
        double interest = calculator.calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principalAmount +
                ", Rate of Interest " + rateOfInterest +
                " and Time " + timePeriod);

        scanner.close();
    }
}


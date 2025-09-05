import java.util.Scanner;

public class TriangularParkRun {
    public double calculateRounds(double sideA, double sideB, double sideC, double totalDistance) {
        double perimeter = sideA + sideB + sideC;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A of the triangle (in meters): ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter side B of the triangle (in meters): ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter side C of the triangle (in meters): ");
        double sideC = scanner.nextDouble();

        double totalDistance = 5000;

        TriangularParkRun parkRun = new TriangularParkRun();
        double rounds = parkRun.calculateRounds(sideA, sideB, sideC, totalDistance);

        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5 km run.");

        scanner.close();
    }
}

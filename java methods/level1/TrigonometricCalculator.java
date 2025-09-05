import java.util.Scanner;

public class TrigonometricCalculator {
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        TrigonometricCalculator calculator = new TrigonometricCalculator();
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine = " + results[0]);
        System.out.println("Cosine = " + results[1]);
        System.out.println("Tangent = " + results[2]);

        scanner.close();
    }
}


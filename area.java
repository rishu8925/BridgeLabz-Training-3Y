import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("Area of the circle is: " + area);

        scanner.close();
    }
}

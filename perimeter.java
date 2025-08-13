import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display result
        System.out.println("Perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }
}

import java.util.Scanner;

public class vol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt user for height
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Display the result
        System.out.println("Volume of the cylinder is: " + volume);

        scanner.close();
    }
}

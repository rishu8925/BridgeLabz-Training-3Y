import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Ask for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        scanner.close();
      }
}

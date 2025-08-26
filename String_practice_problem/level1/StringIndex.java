package String_practice_problem.level1;

import java.util.Scanner;

public class StringIndex {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character at position 100: " + text.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Accessing index beyond string length
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(input); // This will throw the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(input); // Properly handled

        sc.close();
    }
}


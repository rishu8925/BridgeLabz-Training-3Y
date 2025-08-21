package ArraysJava.Array.level2;

import java.util.Scanner;  // Import Scanner for user input

// Program Name: NumberReverser
public class NumberRverser {
    public static void main(String[] args) {
        
        // ---------------------- User Input ----------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");

        // Validate input
        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
            return; // Exit if input is invalid
        }

        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Error: Number must be positive.");
            return; // Exit if input is negative
        }

        // ---------------------- Find Digit Count ----------------------
        int tempNumber = number;
        int digitCount = 0;

        while (tempNumber > 0) {
            digitCount++;
            tempNumber = tempNumber / 10; // Remove last digit
        }

        // ---------------------- Store Digits in Array ----------------------
        int[] digitsArray = new int[digitCount]; // Array to hold digits
        tempNumber = number;

        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = tempNumber % 10; // Extract last digit
            tempNumber = tempNumber / 10;     // Remove last digit
        }

        // ---------------------- Reverse Array ----------------------
        int[] reversedArray = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedArray[i] = digitsArray[digitCount - 1 - i];
        }

        // ---------------------- Display Reversed Number ----------------------
        System.out.print("Reversed number: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
        }

        sc.close(); // Close scanner
    }
}


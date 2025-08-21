package ArraysJava.Array.level2;

import java.util.Scanner;  // Import Scanner for user input

// Program Name: DigitArrayAnalyzer
public class digitArrayAnalyzer {

    public static void main(String[] args) {
        
        // ---------------------- Variable Declaration ----------------------
        int maxDigit = 10;                   // Maximum allowed digits to store
        int[] digitArray = new int[maxDigit]; // Array to store digits
        int index = 0;                       // Current index of array
        
        // ---------------------- User Input ----------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");

        // Validate user input (must be a positive integer)
        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
            return;  // Exit the program if input is invalid
        }

        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Number must be greater than zero.");
            return;  // Exit if input is not valid
        }

        // ---------------------- Extract Digits into Array ----------------------
        while (number != 0 && index < maxDigit) {
            int lastDigit = number % 10;         // Get last digit
            digitArray[index] = lastDigit;       // Store digit in array
            index++;                             // Move to next index
            number = number / 10;                // Remove last digit
        }

        // ---------------------- Find Largest and Second Largest ----------------------
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {   // Use index to loop through stored digits only
            int currentDigit = digitArray[i];

            if (currentDigit > largest) {
                secondLargest = largest;   // Update second largest
                largest = currentDigit;    // Update largest
            } else if (currentDigit > secondLargest && currentDigit != largest) {
                secondLargest = currentDigit; // Update second largest
            }
        }

        // ---------------------- Display Results ----------------------
        System.out.println("Largest digit: " + largest);
        if (secondLargest == 0 && largest != 0) {
            System.out.println("Second largest digit not found (all digits are the same).");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close(); // Close scanner
    }
}


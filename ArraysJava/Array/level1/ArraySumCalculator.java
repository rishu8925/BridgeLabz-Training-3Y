package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: ArraySumCalculator
public class ArraySumCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Define array and variables ----------------------
        double[] numbers = new double[10];   // Array to store max 10 numbers
        double total = 0.0;                  // Variable to store sum
        int index = 0;                       // To track array position

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");

        // ---------------------- Step 2: Infinite loop for input ----------------------
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            
            if (!sc.hasNextDouble()) {  // Validate input
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear invalid entry
                continue;
            }

            double num = sc.nextDouble();

            // Stop if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

            // Store number in array
            numbers[index] = num;
            index++;
        }

        // ---------------------- Step 3: Calculate sum ----------------------
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // ---------------------- Step 4: Display results ----------------------
        System.out.println("\n--- Stored Numbers ---");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nSum of all numbers = " + total);

        sc.close();
    }
}


package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: FizzBuzz
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Step 2: Create String array to store results
        String[] results = new String[number + 1]; // +1 because we include 0

        // Step 3: Apply FizzBuzz logic and save to array
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0"; // special case for 0
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Step 4: Print results with position format
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}


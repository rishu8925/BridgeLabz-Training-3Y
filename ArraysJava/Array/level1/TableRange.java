package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: MultiplicationTableRange
public class TableRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Take input ----------------------
        System.out.print("Enter a number between 6 and 9 to print its multiplication table: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int number = sc.nextInt();

        // Validate range
        if (number < 6 || number > 9) {
            System.out.println("Error: Number must be between 6 and 9.");
            return;
        }

        // ---------------------- Step 2: Define array ----------------------
        int[] multiplicationResult = new int[10];  // store results from 1 to 10

        // ---------------------- Step 3: Compute table ----------------------
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // ---------------------- Step 4: Display results ----------------------
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= multiplicationResult.length; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }

        sc.close();
    }
}


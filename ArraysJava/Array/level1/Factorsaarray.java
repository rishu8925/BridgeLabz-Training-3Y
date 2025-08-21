package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: FactorsArray
public class Factorsaarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- Step 1: Take input ----------------
        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Number must be positive.");
            return;
        }

        // ---------------- Step 2: Initialize array ----------------
        int maxFactor = 10; // initial size
        int[] factors = new int[maxFactor];
        int index = 0; // tracks how many factors stored

        // ---------------- Step 3: Find factors ----------------
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // i is a factor

                // Resize if needed
                if (index == maxFactor) {
                    maxFactor *= 2; // double the size
                    int[] temp = new int[maxFactor];

                    // copy old factors into temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp; // assign back
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // ---------------- Step 4: Display factors ----------------
        System.out.print("\nFactors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}


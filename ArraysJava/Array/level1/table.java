package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: MultiplicationTable
public class table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Take input ----------------------
        System.out.print("Enter a number to print its multiplication table: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int number = sc.nextInt();

        // ---------------------- Step 2: Define array to store results ----------------------
        int[] table = new int[10];  // stores results from number*1 to number*10

        // ---------------------- Step 3: Generate multiplication table ----------------------
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; // store result in array
        }

        // ---------------------- Step 4: Display results ----------------------
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= table.length; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}


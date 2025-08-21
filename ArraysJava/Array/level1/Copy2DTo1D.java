package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: Copy2DTo1D
public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- Step 1: Take user input for rows and columns ----------------
        System.out.print("Enter number of rows: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Error: Rows and columns must be positive.");
            return;
        }

        // ---------------- Step 2: Create and fill 2D array ----------------
        int[][] matrix = new int[rows][cols];
        System.out.println("\nEnter elements of the " + rows + "x" + cols + " matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                if (!sc.hasNextInt()) {
                    System.out.println("Error: Please enter a valid integer.");
                    return;
                }
                matrix[i][j] = sc.nextInt();
            }
        }

        // ---------------- Step 3: Create 1D array and copy ----------------
        int[] array = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // ---------------- Step 4: Display arrays ----------------
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n1D Array after copying:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}


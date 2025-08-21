package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: MeanHeightFootballTeam
public class FootballTeam {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------- Step 1: Define array and variables ----------------
        double[] heights = new double[11];   // array to store heights of 11 players
        double sum = 0.0;                     // variable to store sum

        // ---------------- Step 2: Take input ----------------
        System.out.println("Enter the heights of 11 football players (in cm):");

        for (int i = 0; i < heights.length; i++) {
            while (true) { // input validation
                System.out.print("Enter height of player " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // clear invalid input
                    continue;
                }
                double height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                } else {
                    heights[i] = height;
                    break; // valid input, exit loop
                }
            }
        }

        // ---------------- Step 3: Compute sum ----------------
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // ---------------- Step 4: Compute mean ----------------
        double mean = sum / heights.length;

        // ---------------- Step 5: Display result ----------------
        System.out.println("\nThe mean height of the football team is: " + mean + " cm");

        sc.close();
    }
}


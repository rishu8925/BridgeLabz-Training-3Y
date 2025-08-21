package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: VotingEligibilityChecker
public class voting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Define array for ages ----------------------
        int[] ages = new int[10];

        // ---------------------- Step 2: Take user input ----------------------
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // ---------------------- Step 3: Check voting eligibility ----------------------
        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("Student " + (i + 1) + " → Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}


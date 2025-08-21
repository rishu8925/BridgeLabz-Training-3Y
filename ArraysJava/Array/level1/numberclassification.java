package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: NumberClassification
public class numberclassification {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Define array ----------------------
        int[] numbers = new int[5];

        // ---------------------- Step 2: Take user input ----------------------
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // ---------------------- Step 3: Check positive/negative/zero ----------------------
        System.out.println("\n--- Number Classification ---");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number " + num + " is Zero.");
            }
        }

        // ---------------------- Step 4: Compare first and last element ----------------------
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\n--- Comparison of First and Last Elements ---");
        if (first == last) {
            System.out.println("First element (" + first + ") is EQUAL to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is GREATER than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is LESS than last element (" + last + ").");
        }

        sc.close();
    }
}


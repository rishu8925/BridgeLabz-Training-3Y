package String_practice_problem.level 2;

import java.util.Scanner;

public class stringLength {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when index is out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception is expected to break the loop
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Using user-defined method
        int customLength = findLength(input);

        // Using built-in method
        int builtinLength = input.length();

        // Display results
        System.out.println("\nUser-defined length: " + customLength);
        System.out.println("Built-in length: " + builtinLength);

        sc.close();
    }
}


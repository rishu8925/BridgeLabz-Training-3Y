package String_practice_problem;

import java.util.Scanner;

public class StringCharComparison {

    // User-defined method to return characters of a string without using toCharArray()
    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i); // Extract each character
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Getting character arrays
        char[] userDefinedChars = getChars(input); // Using user-defined method
        char[] builtInChars = input.toCharArray(); // Using built-in method

        // Comparing both results
        boolean isEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Displaying results
        System.out.println("\nUser-defined method characters:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray() characters:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nComparison Result: " + (isEqual ? "Arrays are Equal" : "Arrays are NOT Equal"));
        
        sc.close();
    }
}


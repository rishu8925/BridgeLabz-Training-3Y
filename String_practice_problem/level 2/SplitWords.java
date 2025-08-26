package String_practice_problem.level 2;

import java.util.Scanner;

public class SplitWords {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // throws exception when index is out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exit
        }
        return count;
    }

    // Method to split the string into words manually (without split())
    public static String[] manualSplit(String text) {
        int length = findLength(text);

        // First count words
        int wordCount = 1; // at least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[wordIndex++] = text.substring(start, end);
            start = end + 1; // skip space
        }

        // Last word
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input with spaces
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // User-defined split
        String[] manualWords = manualSplit(input);

        // Built-in split
        String[] builtinWords = input.split(" ");

        // Compare arrays
        boolean isEqual = compareArrays(manualWords, builtinWords);

        // Display user-defined words
        System.out.println("\nUser-defined split words:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        // Display built-in words
        System.out.println("\nBuilt-in split() words:");
        for (String word : builtinWords) {
            System.out.println(word);
        }

        // Comparison result
        System.out.println("\nComparison Result: " + (isEqual ? "Arrays are Equal" : "Arrays are NOT Equal"));

        sc.close();
    }
}


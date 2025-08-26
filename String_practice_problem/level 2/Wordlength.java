package String_practice_problem.level 2;

import java.util.Scanner;

public class Wordlength{

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // throws exception when index is out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exit loop
        }
        return count;
    }

    // Method to split string into words manually (no split())
    public static String[] manualSplit(String text) {
        int length = findLength(text);

        // count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // extract words
        String[] words = new String[wordCount];
        int start = 0, wIndex = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[wIndex++] = text.substring(start, end);
            start = end + 1;
        }
        words[wIndex] = text.substring(start, length);

        return words;
    }

    // Method to build 2D array: word + its length
    public static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // word
            table[i][1] = String.valueOf(findLength(words[i])); // length as String
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Split into words
        String[] words = manualSplit(input);

        // Build 2D array
        String[][] table = buildWordLengthTable(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]); // convert back to int
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}


package String_practice_problem.level 3;

import java.util.Scanner;

public class findfirst {

    
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

       
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find result
        char result = findFirstNonRepeatingChar(input);

        // Display
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}


package ArraysJava.Array.level2;
import java.util.Scanner;

// Program Name: DigitFrequencyCounter
public class DigitfrequencyCounter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Take input ----------------------
        System.out.print("Enter a positive integer number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
            return;
        }

        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Error: Number must be positive.");
            return;
        }

        // ---------------------- Step 2: Count digits ----------------------
        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // ---------------------- Step 3: Store digits in array ----------------------
        int[] digitsArray = new int[digitCount];
        temp = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = temp % 10;
            temp /= 10;
        }

        // ---------------------- Step 4: Find frequency ----------------------
        int[] frequency = new int[10]; // index = digit, value = count
        for (int i = 0; i < digitCount; i++) {
            int digit = digitsArray[i];
            frequency[digit]++;
        }

        // ---------------------- Step 5: Display frequency ----------------------
        System.out.println("\nDigit Frequency in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " → " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}


package ArraysJava.Array.level1;

import java.util.Scanner;

// Program Name: OddEvenArray
public class OddEvenArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------- Step 1: Take user input ----------------
        System.out.print("Enter a natural number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }

        // ---------------- Step 2: Define arrays ----------------
        int size = number / 2 + 1; // maximum possible odd/even numbers
        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];

        int evenIndex = 0, oddIndex = 0;

        // ---------------- Step 3: Fill arrays ----------------
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // ---------------- Step 4: Print odd numbers ----------------
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // ---------------- Step 5: Print even numbers ----------------
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}


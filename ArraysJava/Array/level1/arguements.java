package ArraysJava.Array.level1;

import java.util.Scanner;

public class arguements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            System.out.println("Handling IllegalArgumentException...");
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) { 
            System.out.println("Caught a RuntimeException!");
            System.out.println("Error Message: " + e.getMessage());
        }

        sc.close();
    }
}


package java_control_flow.level1;
import java.util.Scanner;

public class Divisibleb54
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();             // Read number from user

        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        sc.close(); // close the scanner
    }
}


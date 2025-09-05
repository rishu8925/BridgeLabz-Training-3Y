import java.util.Scanner;

public class NumberChecker {
    public int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        NumberChecker checker = new NumberChecker();
        int result = checker.checkNumber(inputNumber);

        if (result == 1) {
            System.out.println(inputNumber + " is Positive.");
        } else if (result == -1) {
            System.out.println(inputNumber + " is Negative.");
        } else {
            System.out.println(inputNumber + " is Zero.");
        }

        scanner.close();
    }
}


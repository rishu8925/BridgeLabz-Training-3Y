import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    public int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    // @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            SumOfNaturalNumbersComparison calculator = new SumOfNaturalNumbersComparison();

            int recursiveResult = calculator.sumRecursive(n);
            int formulaResult = calculator.sumFormula(n);

            System.out.println("Sum using recursion = " + recursiveResult);
            System.out.println("Sum using formula  = " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both methods give the same result ✅");
            } else {
                System.out.println("Mismatch in results ❌");
            }
        }

        scanner.close();
    }
}


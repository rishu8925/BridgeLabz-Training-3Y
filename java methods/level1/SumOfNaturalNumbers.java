import java.util.Scanner;

public class SumOfNaturalNumbers {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        SumOfNaturalNumbers sumCalculator = new SumOfNaturalNumbers();
        int result = sumCalculator.calculateSum(n);

        System.out.println("The sum of first " + n + " natural numbers is: " + result);

        scanner.close();
    }
}

import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

       
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else {
                System.out.println("Number " + num + " is Negative");
            }
        }

        
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if(result != 1)
            if (result == 0) {
                System.out.println("First number " + numbers[0] + " is equal to last number " + numbers[numbers.length - 1]);
            } else {
                System.out.println("First number " + numbers[0] + " is less than last number " + numbers[numbers.length - 1]);
            } else {
            System.out.println("First number " + numbers[0] + " is greater than last number " + numbers[numbers.length - 1]);
        }

        scanner.close();
    }
}


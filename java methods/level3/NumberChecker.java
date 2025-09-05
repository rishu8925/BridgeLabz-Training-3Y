import java.util.Arrays;

public class NumberChecker {


    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int count = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, count);
        }
        return sum == number;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; 
        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = getDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        boolean duck = isDuckNumber(digits);
        System.out.println("Is Duck Number? " + duck);

        boolean armstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number? " + armstrong);

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }
}


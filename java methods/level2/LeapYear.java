import java.util.Scanner;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        LeapYear checker = new LeapYear();
        boolean result = checker.isLeapYear(year);

        if (year < 1582) {
            System.out.println("The program only works for years >= 1582 (Gregorian calendar).");
        } else if (result) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        scanner.close();
    }
}


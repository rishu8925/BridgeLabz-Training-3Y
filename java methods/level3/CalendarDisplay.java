import java.util.Scanner;

public class CalendarDisplay {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to get the first day of the month using Zeller’s Congruence
    public static int getFirstDay(int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int q = 1;  // Day of the month
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        // Zeller's Congruence: 0 = Saturday, 1 = Sunday, 2 = Monday, ...
        int dayOfWeek = ((h + 6) % 7); // Convert to: 0 = Sunday, 1 = Monday, ...
        return dayOfWeek;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int startDay = getFirstDay(month, year);

        System.out.println("     " + monthName + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        // First loop for spacing before the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);

            
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

   
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}


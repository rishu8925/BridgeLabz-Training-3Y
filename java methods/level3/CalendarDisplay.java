import java.util.Scanner;

public class CalendarDisplay {

    
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }


    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    public static int getFirstDay(int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int q = 1; 
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        int dayOfWeek = ((h + 6) % 7); 
        return dayOfWeek;
    }
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int startDay = getFirstDay(month, year);

        System.out.println("     " + monthName + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        
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


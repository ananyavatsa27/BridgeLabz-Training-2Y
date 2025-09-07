import java.util.Scanner;

public class q3_Calender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter 1 to 12.");
            return;
        }

        displayCalendar(month, year);
    }

    // Display calendar for given month and year
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int startDay = getStartDay(month, year);

        // Print header
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days
        int dayCounter = startDay;
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            dayCounter++;
            if (dayCounter % 7 == 0) {
                System.out.println();
            }
        }

        // Print newline if last line not complete
        if (dayCounter % 7 != 0) {
            System.out.println();
        }
    }

    // Get month name from month number
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Get number of days in month (considering leap year for Feb)
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Check leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    // Get the start day of the month (0=Sunday, 1=Monday,...)
    // Using Zeller's Congruence algorithm (adjusted for Gregorian calendar)
    public static int getStartDay(int month, int year) {
        int m = month;
        int y = year;
        if (month == 1 || month == 2) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (1 + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        // h = 0 means Saturday, so convert to Sunday=0,... Saturday=6
        int day = ((h + 6) % 7);

        return day;
    }
}

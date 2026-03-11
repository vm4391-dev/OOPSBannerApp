import java.util.Scanner;

public class LeapYearCheck {

    // Approach 1: Multiple if-else statements
    public static String leapYearMultipleIf(int year) {
        if (year < 1582) {
            return "Year is before Gregorian calendar. Not valid for check.";
        }
        if (year % 4 != 0) {
            return year + " is NOT a Leap Year.";
        } else if (year % 100 != 0) {
            return year + " IS a Leap Year.";
        } else if (year % 400 == 0) {
            return year + " IS a Leap Year.";
        } else {
            return year + " is NOT a Leap Year.";
        }
    }

    // Approach 2: Single if with logical operators
    public static String leapYearSingleIf(int year) {
        if (year < 1582) {
            return "Year is before Gregorian calendar. Not valid for check.";
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " IS a Leap Year.";
        } else {
            return year + " is NOT a Leap Year.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a year (>= 1582): ");
            int year = sc.nextInt();

            // Approach 1
            System.out.println("\n--- Approach 1: Multiple if-else ---");
            System.out.println(leapYearMultipleIf(year));

            // Approach 2
            System.out.println("\n--- Approach 2: Single if ---");
            System.out.println(leapYearSingleIf(year));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer year.");
        } finally {
            sc.close();
        }
    }
}

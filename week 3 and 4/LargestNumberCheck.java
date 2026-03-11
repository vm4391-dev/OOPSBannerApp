import java.util.Scanner;

public class LargestNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input three numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter third number: ");
            double num3 = scanner.nextDouble();

            // Find the maximum value
            double maxValue = Math.max(num1, Math.max(num2, num3));

            // Check if each number is the largest
            boolean firstLargest = (num1 == maxValue);
            boolean secondLargest = (num2 == maxValue);
            boolean thirdLargest = (num3 == maxValue);

            // Output results
            System.out.println("Is the first number the largest? " + firstLargest);
            System.out.println("Is the second number the largest? " + secondLargest);
            System.out.println("Is the third number the largest? " + thirdLargest);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}

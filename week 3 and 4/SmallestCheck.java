import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter three numbers (number1 number2 number3): ");

            // Read inputs
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            // Check if the first number is the smallest
            if (num1 < num2 && num1 < num3) {
                System.out.println("Is the first number the smallest? YES");
            } else {
                System.out.println("Is the first number the smallest? NO");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}

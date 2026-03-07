import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking floating-point inputs from the user
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            // Performing operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;

            // Division with zero check
            String divisionResult;
            if (number2 != 0) {
                double division = number1 / number2;
                divisionResult = String.valueOf(division);
            } else {
                divisionResult = "Undefined (division by zero)";
            }

            // Displaying results
            System.out.println("\nResults:");
            System.out.println(number1 + " + " + number2 + " = " + addition);
            System.out.println(number1 + " - " + number2 + " = " + subtraction);
            System.out.println(number1 + " * " + number2 + " = " + multiplication);
            System.out.println(number1 + " / " + number2 + " = " + divisionResult);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

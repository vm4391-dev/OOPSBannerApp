import java.util.Scanner;

public class EmployeeBonusCalculator {

    // Method to calculate bonus
    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05; // 5% bonus
        }
        return 0.0; // No bonus
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get salary input
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            if (salary <= 0) {
                System.out.println("Salary must be a positive number.");
                return;
            }

            // Get years of service input
            System.out.print("Enter years of service: ");
            int years = scanner.nextInt();
            if (years < 0) {
                System.out.println("Years of service cannot be negative.");
                return;
            }

            // Calculate bonus
            double bonus = calculateBonus(salary, years);

            // Display result
            if (bonus > 0) {
                System.out.printf("Bonus amount: ₹%.2f%n", bonus);
            } else {
                System.out.println("No bonus. Years of service must be more than 5.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}

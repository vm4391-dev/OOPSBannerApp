import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Validate input
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        // Check divisibility by 5
        if (number % 5 == 0) {
            System.out.printf("Is the number %d divisible by 5? Yes%n", number);
        } else {
            System.out.printf("Is the number %d divisible by 5? No%n", number);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class TriangleAreaConverter {

    // Method to calculate area in sq cm and sq in
    public static double[] calculateArea(double baseCm, double heightCm) {
        double areaSqCm = 0.5 * baseCm * heightCm;
        double areaSqIn = areaSqCm / (2.54 * 2.54); // 1 inch = 2.54 cm
        return new double[]{areaSqCm, areaSqIn};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input base and height
            System.out.print("Enter the base of the triangle in cm: ");
            double base = scanner.nextDouble();

            System.out.print("Enter the height of the triangle in cm: ");
            double height = scanner.nextDouble();

            // Validate inputs
            if (base <= 0 || height <= 0) {
                System.out.println("Base and height must be positive numbers.");
                return;
            }

            // Calculate areas
            double[] areas = calculateArea(base, height);

            // Display results
            System.out.printf("The Area of the triangle in sq cm is %.2f%n", areas[0]);
            System.out.printf("The Area of the triangle in sq in is %.2f%n", areas[1]);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

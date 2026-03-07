public class HarryAge {
    public static void main(String[] args) {
        // Define Harry's birth year
        int birthYear = 2000;

        // Define the current year
        int currentYear = 2024;

        // Validate that current year is not before birth year
        if (currentYear < birthYear) {
            System.out.println("Error: Current year cannot be before birth year.");
            return;
        }

        // Calculate age
        int age = currentYear - birthYear;

        // Display the result
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}

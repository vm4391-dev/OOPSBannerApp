import java.util.Arrays;

public class OOPSBannersUC3 {
    public static void main(String[] args) {
        // Each letter is represented as an array of strings (rows)
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };

        // Print the banner for "OOPS"
        for (int i = 0; i < O.length; i++) {
            // Use String.join to combine letters with spaces
            String line = String.join("  ", Arrays.asList(O[i], O[i], P[i], S[i]));
            System.out.println(line);
        }
    }
}

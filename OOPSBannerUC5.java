public class OOPSBannerUC5 {
    public static void main(String[] args) {
        // 1 & 2: Declare, initialize, and use String.join() within array literal
        String[] banner = {
            String.join("", " ***  ", " ***  ", "***** ", " ****  "),
            String.join("", "*   * ", "*   * ", "*    *", "*      "),
            String.join("", "*   * ", "*   * ", "*    *", " *     "),
            String.join("", "*   * ", "*   * ", "***** ", "  **** "),
            String.join("", "*   * ", "*   * ", "*     ", "      *"),
            String.join("", "*   * ", "*   * ", "*     ", "*    * "),
            String.join("", " ***  ", " ***  ", "*     ", " ****  "),
        };

        // 4: For-each loop to print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
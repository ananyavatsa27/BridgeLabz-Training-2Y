import java.util.Scanner;

public class q8_UpperCase {

    // Method to convert string to uppercase using charAt() and ASCII values
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If lowercase letter (ASCII 'a' to 'z'), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                char upperChar = (char) (ch - 32);  // difference between lowercase and uppercase ASCII
                result.append(upperChar);
            } else {
                // Otherwise, append as is
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCustom(String str1, String str2) {
        // First check length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Convert to uppercase using custom method
        String upperCustom = toUpperCaseCustom(inputText);

        // Convert to uppercase using built-in method
        String upperBuiltIn = inputText.toUpperCase();

        // Compare the two results using custom comparison method
        boolean areEqual = compareStringsCustom(upperCustom, upperBuiltIn);

        // Display results
        System.out.println("\nCustom uppercase conversion: " + upperCustom);
        System.out.println("Built-in uppercase conversion: " + upperBuiltIn);
        System.out.println("Are both uppercase conversions equal? " + areEqual);

        scanner.close();
    }
}

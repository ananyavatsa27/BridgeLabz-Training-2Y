import java.util.Scanner;

public class q9_LowerCaseDemo {

    // Method to convert string to lowercase using charAt() and ASCII values
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If uppercase letter (ASCII 'A' to 'Z'), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                char lowerChar = (char) (ch + 32);  // difference between uppercase and lowercase ASCII
                result.append(lowerChar);
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

        // Convert to lowercase using custom method
        String lowerCustom = toLowerCaseCustom(inputText);

        // Convert to lowercase using built-in method
        String lowerBuiltIn = inputText.toLowerCase();

        // Compare the two results using custom comparison method
        boolean areEqual = compareStringsCustom(lowerCustom, lowerBuiltIn);

        // Display results
        System.out.println("\nCustom lowercase conversion: " + lowerCustom);
        System.out.println("Built-in lowercase conversion: " + lowerBuiltIn);
        System.out.println("Are both lowercase conversions equal? " + areEqual);

        scanner.close();
    }
}


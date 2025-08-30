import java.util.Scanner;

public class q2_CompareSubstring{

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the main string: ");
        String mainText = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Generate substrings
        String customSubstring = createSubstringUsingCharAt(mainText, startIndex, endIndex);
        String builtInSubstring = "";

        // Avoid StringIndexOutOfBoundsException
        if (startIndex >= 0 && endIndex <= mainText.length()) {
            builtInSubstring = mainText.substring(startIndex, endIndex);
        }

        // Display results
        System.out.println("\nCustom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);

        // Compare substrings
        boolean comparisonResult = compareUsingCharAt(customSubstring, builtInSubstring);
        System.out.println("Comparison result: " + comparisonResult);

        scanner.close();
    }
}

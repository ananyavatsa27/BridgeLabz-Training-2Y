import java.util.Scanner;

public class q3_CompareCharArray {

    // Method to return characters from a string without using toCharArray()
    public static char[] getCharsFromString(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get characters using custom method
        char[] customChars = getCharsFromString(input);

        // Get characters using built-in toCharArray()
        char[] builtInChars = input.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        // Display both arrays
        System.out.print("\nCharacters from custom method: ");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters from toCharArray(): ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        // Display result of comparison
        System.out.println("\n\nComparison Result: " + (areEqual ? "✅ Arrays are equal." : "❌ Arrays are NOT equal."));

        scanner.close();
    }
}


import java.util.Scanner;

public class q11_NumberChecker3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = extractDigits(number, digitCount);
        System.out.print("Digits array: ");
        printArray(digits);

        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed digits array: ");
        printArray(reversed);

        boolean arraysEqual = compareArrays(digits, reversed);
        System.out.println("Are digits array and reversed array equal? " + arraysEqual);

        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is the number a palindrome? " + isPalindrome);

        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is the number a duck number? " + isDuck);
    }

    // Count digits in number
    public static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Extract digits into array
    public static int[] extractDigits(int num, int count) {
        num = Math.abs(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Compare two arrays for equality
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Check if digits array represents a palindrome
    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseDigits(digits));
    }

    // Duck number: has at least one non-zero digit (assuming leading zeros ignored)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    // Helper method to print an integer array
    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

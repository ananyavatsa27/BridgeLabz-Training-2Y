import java.util.Scanner;

public class q12_NumberChecker4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Is prime number? " + isPrime(number));
        System.out.println("Is neon number? " + isNeon(number));
        System.out.println("Is spy number? " + isSpy(number));
        System.out.println("Is automorphic number? " + isAutomorphic(number));
        System.out.println("Is buzz number? " + isBuzz(number));
    }

    // Check prime number: >1 and no divisors besides 1 and itself
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check neon number: sum of digits of square == number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sumDigits = 0;
        while (square > 0) {
            sumDigits += square % 10;
            square /= 10;
        }
        return sumDigits == num;
    }

    // Check spy number: sum of digits == product of digits
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int n = Math.abs(num);

        // If number is 0, sum=0 and product=0, but zero is not spy number by definition
        if (n == 0) return false;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Check automorphic number: square ends with the number itself
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Check buzz number: divisible by 7 or ends with 7
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }
}

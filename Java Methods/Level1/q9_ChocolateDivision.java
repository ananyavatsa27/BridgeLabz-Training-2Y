import java.util.Scanner;

public class q9_ChocolateDivision {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Input number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check for division by zero
        if (numberOfChildren == 0) {
            System.out.println("You cannot divide chocolates among 0 children!");
        } else {
            // Calculate result using the method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output the result
            System.out.println("Each child gets: " + result[0] + " chocolate(s)");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}


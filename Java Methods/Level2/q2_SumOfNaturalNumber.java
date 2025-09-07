import java.util.Scanner;

public class q2_SumOfNaturalNumber {
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive natural number.");
            return;
        }

        // Compute sum using both methods
        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        // Display results
        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula:   " + formulaResult);

        // Compare results
        if (recursiveResult == formulaResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println(" There is a mismatch in the results!");
        }
    }
}


import java.util.Scanner;

public class q6_NaturalNumberSum {

    // Method to calculate sum of n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            
            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                int sum = sumOfNaturalNumbers(n);
                System.out.println("The sum of first " + n + " natural numbers is: " + sum);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}


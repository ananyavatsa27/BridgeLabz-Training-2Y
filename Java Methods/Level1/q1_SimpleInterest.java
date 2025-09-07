import java.util.*;

public class q1_SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input from the user
            System.out.print("Enter the Principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the Rate of interest: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the Time (in years): ");
            double time = scanner.nextDouble();

            // Calculating simple interest
            double interest = calculateSimpleInterest(principal, rate, time);

            // Output the result
            System.out.println("The Simple Interest is " + interest +
                               " for Principal " + principal +
                               ", Rate " + rate + "%, and Time " + time + " years.");

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

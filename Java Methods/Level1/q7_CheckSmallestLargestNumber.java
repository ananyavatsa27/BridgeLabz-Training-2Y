import java.util.Scanner;

public class q7_CheckSmallestLargestNumber {


    public static int[] findSmallestLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        
        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input three numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            // Find smallest and largest
            int[] minMax = findSmallestLargest(num1, num2, num3);

            System.out.println("Smallest number: " + minMax[0]);
            System.out.println("Largest number: " + minMax[1]);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}

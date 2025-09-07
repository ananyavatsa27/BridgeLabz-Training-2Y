import java.util.Scanner;

public class q9_NumberChecker {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

   
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 < number2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("The number is positive and even.");
                } else {
                    System.out.println("The number is positive and odd.");
                }
            } else {
                System.out.println("The number is negative.");
            }
        }

        
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last.");
        } else if (result == -1) {
            System.out.println("First number is less than the last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        scanner.close();
    }
}

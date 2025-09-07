import java.util.Scanner;

public class q4_NumberCheck {

   
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();

            
            int result = checkNumber(input);

            
            if (result == 1) {
                System.out.println("The number is positive.");
            } else if (result == -1) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}


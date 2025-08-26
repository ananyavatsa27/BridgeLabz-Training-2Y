import java.util.*;

public class q15_FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;

        if (num >= 0) {
            for (int i = num; i >= 1; i--) {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is " + fact);
        } else {
            System.out.println("You entered a negative number. Factorial is not defined.");
        }

        sc.close();
    }
}
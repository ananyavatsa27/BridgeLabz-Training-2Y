import java.util.*;

public class q14_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;

        if (num >= 0) {  
            int temp = num; 
            while (temp > 1) {
                factorial *= temp;
                temp--;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        } else {
            System.out.println("You entered a negative number. Factorial is not defined.");
        }

        sc.close();
    }
}

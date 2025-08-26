import java.util.*;

public class q17_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = 0.5 * salary;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus, since years of service are 5 or less.");
        }

        sc.close();
    }
}
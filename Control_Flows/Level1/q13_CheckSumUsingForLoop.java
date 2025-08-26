import java.util.*;

public class q13_CheckSumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int formulaSum = num * (num + 1) / 2;
        int forSum = 0;

        for (int i = 1; i <= num; i++) {
            forSum += i;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + forSum);
        System.out.println("Both sums are equal? " + (forSum == formulaSum));

        sc.close();
    }
}

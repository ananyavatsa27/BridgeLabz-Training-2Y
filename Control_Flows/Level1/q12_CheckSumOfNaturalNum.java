import java.util.*;
public class q12_CheckSumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            
            int formulaSum = n * (n + 1) / 2;

            
            int i = 1, whileSum = 0;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("While Loop Sum = " + whileSum);
            System.out.println("Are both equal? " + (formulaSum == whileSum));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}

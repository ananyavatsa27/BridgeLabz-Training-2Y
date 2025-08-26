import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Factors of " + number + " are: ");
        for(int i = 1; i<=Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                if (i != number /i) {
                    System.out.print(number / i + " ");
                }
            }
        }


        sc.close();
    }
    
}

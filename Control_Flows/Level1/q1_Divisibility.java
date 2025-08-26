import java.util.Scanner;

public class Divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(check(num)) {
            System.out.println(num + "is divisible by 5");
        } else {
            System.out.println(num + "is not divisible by 5");

        }

        sc.close();
    }
    public static boolean check(int num) {
        int lastDigit = num % 10;
        return (lastDigit == 0 || lastDigit == 5);
    }

    }


import java.util.*;
public class q8_CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printCountDown(num);
        sc.close();
    }

    public static void printCountDown(int num){
        while (num>=1){
            System.out.println(num);
        }

   }
}


import java.util.*;

public class q6_PositiveNegZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num>0) ? "Number is Positive" : (num<0) ? "The number is negative" : "The number is zero";
        System.out.println(result);
        sc.close();
        }
    }
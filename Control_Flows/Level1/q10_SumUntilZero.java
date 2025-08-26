import java.util.*;

public class q10_SumUntilZero{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter a number(Enter 0 to stop)");
        double value = sc.nextDouble();

        while(value!=0){
            total+=value;
            value = sc.nextDouble();

        }
        
        System.out.println("Total = "+ total);
        sc.close();
    }
}
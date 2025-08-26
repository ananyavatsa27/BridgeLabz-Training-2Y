import java.util.*;

    public class q11_SumUntilBreak {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while(true) {
            System.out.println("Enter a number :");
            double value = sc.nextDouble();
            if(value <= 0) {
                break;
            }
            total += value;
        }
        System.out.println("Total = " + total);
        sc.close();
    }

}
    

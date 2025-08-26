import java.util.*;
public class q8_FactorsWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i <= Math.sqrt(n)){
            if(n%i ==0){
                System.out.println(i);
            
            if(i != n/i){
                System.out.println(n/i);
            }
        }
        i++;
        }
        sc.close();
    }
}
import java.util.*;


public class GreatestFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int factor = 1;
        for(int i = n/2;i>=1;i++){
            if(n%i==0){
                factor = i;
                break;
            }
        }
        System.out.println(factor);
        sc.close();
    }
    
}

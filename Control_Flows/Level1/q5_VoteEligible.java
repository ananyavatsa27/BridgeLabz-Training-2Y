import java.util.*;

    
public class q5_VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age  = sc.nextInt();
        boolean check = age>18;
        if(check){
            System.out.println("The person can vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
        sc.close();

    }

     
}

    


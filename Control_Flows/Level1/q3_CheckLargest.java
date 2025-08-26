import java.util.*;
 
public class q3_CheckLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean firstLargest = (num1 >= num2 && num1 >= num3);
        boolean secondLargest = (num2 >= num1 && num2 >= num3);
        boolean thirdLargest = (num3 >= num1 && num3 >= num2);

        System.out.println("Is the first num the largest? " + firstLargest);
        System.out.println("Is the second num the largest? " + secondLargest);
        System.out.println("Is the third num the largest? " + thirdLargest);
        
        sc.close();
    }
    
}

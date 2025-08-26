import java.util.*;

public class FriendsComparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        String youngest = (ageAmar < ageAkbar && ageAmar < ageAnthony) ? "Amar"
                        : (ageAkbar < ageAnthony) ? "Akbar"
                        : "Anthony";

        String tallest = (heightAmar > heightAkbar && heightAmar > heightAnthony) ? "Amar"
                        : (heightAkbar > heightAnthony) ? "Akbar"
                        : "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
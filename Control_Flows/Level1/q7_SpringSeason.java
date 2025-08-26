import java.util.Scanner;

public class q7_SpringSeason{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        if((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 20 && day <= 30) ||
            (month == 5 && day >= 20 && day <= 31) ||
            (month == 6 && day >= 20 && day <= 20)) {
                System.out.println("Its a Spring Season");
            }
            else {
                System.out.println("Not a Spring Season");
            }
            sc.close();
            }

        

    }
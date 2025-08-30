import java.util.Scanner;

public class q6_NumberFormatException {

    
    public static void generateNumberFormatException(String text) {
        
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

   
    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("❌ Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("❌ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number (as string): ");
        String input = scanner.next();

        
        System.out.println("Calling method that generates NumberFormatException:");
        try {
            generateNumberFormatException(input);
        } catch (RuntimeException e) {
            System.out.println("Caught in main: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        
        System.out.println("Calling method that handles NumberFormatException:");
        handleNumberFormatException(input);

        scanner.close();
    }
}


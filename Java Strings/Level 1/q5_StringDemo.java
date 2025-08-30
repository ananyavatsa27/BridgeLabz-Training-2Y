import java.util.Scanner;

public class q5_StringDemo {


    public static void generateStringIndexOutOfBoundsException(String text) {
        
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        
        System.out.println(" Calling method that generates StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        
        System.out.println("Calling method that handles StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(userInput);

        scanner.close();
    }
}




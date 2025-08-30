import java.util.*;

public class q4_NullPointerException {

    // Method to generate NullPointerException without handling it
    public static void generateNullPointerException() {
        String text = null;

        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleNullPointerException() {
        String text = null;

        try {
            // Attempt to call a method on a null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println(" NullPointerException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Call method that generates exception
        System.out.println("Calling method that generates NullPointerException:");
        try {
            generateNullPointerException(); // This will throw and be caught here
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        // Call method that handles exception internally
        System.out.println("Calling method that handles NullPointerException:");
        handleNullPointerException();
    }
}

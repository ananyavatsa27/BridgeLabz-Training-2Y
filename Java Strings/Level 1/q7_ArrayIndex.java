import java.util.Scanner;

public class q7_ArrayIndex {

    // Method to generate ArrayIndexOutOfBoundsException (without handling)
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Intentionally accessing index out of bounds
        System.out.println("Accessing name at index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Intentionally accessing index out of bounds
            System.out.println("Accessing name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("❌ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of names to input
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Initialize and populate array
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name[" + i + "]: ");
            names[i] = scanner.nextLine();
        }

        // First: call method that generates the exception (no internal handling)
        System.out.println("\n🔴 Calling method that generates ArrayIndexOutOfBoundsException:");
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (RuntimeException e) {
            System.out.println("Caught in main: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        // Second: call method that handles the exception internally
        System.out.println("\n🟢 Calling method that handles ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);

        scanner.close();
    }
}


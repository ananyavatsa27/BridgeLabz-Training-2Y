import java.util.Scanner;

public class q2_MaximumNumber {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            if (numberOfStudents < 0) {
                System.out.println("Number of students cannot be negative.");
            } else {

                int handshakes = calculateHandshakes(numberOfStudents);
                System.out.println("The maximum number of possible handshakes is: " + handshakes);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

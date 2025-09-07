import java.util.Scanner;

public class q7_StudentVoteChecker {

    // Method to check if the student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        } else if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Underage
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Input and processing
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            boolean canVote = canStudentVote(studentAges[i]);

            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered. Student cannot vote.");
            } else if (canVote) {
                System.out.println("Student is eligible to vote.");
            } else {
                System.out.println("Student is not eligible to vote.");
            }
        }

        scanner.close();
    }
}

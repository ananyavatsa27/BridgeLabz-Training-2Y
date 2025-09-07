import java.util.Scanner;

public class q15_Score {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Number of students must be positive.");
            return;
        }

        // Generate random PCM scores for students
        int[][] pcmScores = generateRandomPCMScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] totalsAvgPct = calculateTotalsAvgPct(pcmScores);

        // Display the complete scorecard
        displayScorecard(pcmScores, totalsAvgPct);
    }

    // Method to generate random 2-digit scores (10 to 99) for PCM subjects
    // Returns 2D int array: rows = students, columns = 3 subjects (physics, chemistry, maths)
    public static int[][] generateRandomPCMScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); // generates from 10 to 99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    // Returns 2D double array: rows = students, columns = [total, average, percentage]
    public static double[][] calculateTotalsAvgPct(int[][] pcmScores) {
        int numStudents = pcmScores.length;
        double[][] results = new double[numStudents][3];
        int maxTotalMarks = 300;  // 3 subjects * max 100 marks each

        for (int i = 0; i < numStudents; i++) {
            int total = pcmScores[i][0] + pcmScores[i][1] + pcmScores[i][2];
            double average = (double) total / 3.0;
            double percentage = ((double) total / maxTotalMarks) * 100;

            // Round to 2 decimal digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] pcmScores, double[][] totalsAvgPct) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < pcmScores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(pcmScores[i][0] + "\t");
            System.out.print(pcmScores[i][1] + "\t\t");
            System.out.print(pcmScores[i][2] + "\t");
            System.out.print((int) totalsAvgPct[i][0] + "\t");
            System.out.print(totalsAvgPct[i][1] + "\t");
            System.out.print(totalsAvgPct[i][2] + "%");
            System.out.println();
        }
    }
}
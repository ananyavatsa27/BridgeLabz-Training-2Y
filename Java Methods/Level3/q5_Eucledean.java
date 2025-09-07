import java.util.Scanner;

public class q5_Eucledean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates
        System.out.print("Enter coordinates of point 1 (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter coordinates of point 2 (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between points: %.4f\n", distance);

        // Calculate line equation
        double[] lineParams = calculateLineEquation(x1, y1, x2, y2);

        if (Double.isNaN(lineParams[0])) {
            System.out.println("The line through points is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of line: y = %.4fx + %.4f\n", lineParams[0], lineParams[1]);
        }
    }

    // Method to calculate Euclidean distance
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and y-intercept of line passing through two points
    // Returns array with slope and y-intercept. If vertical line, slope is NaN.
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope;
        double yIntercept;

        if (x2 == x1) {
            // Vertical line: slope undefined
            slope = Double.NaN;
            yIntercept = Double.NaN;
        } else {
            slope = (y2 - y1) / (x2 - x1);
            yIntercept = y1 - slope * x1;
        }

        return new double[] {slope, yIntercept};
    }
}

import java.util.Scanner;

public class q4_Collinear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample points demonstration
        System.out.println("Sample points A(2,4), B(4,6), C(6,8) collinearity check:");
        boolean collinearSlopeSample = areCollinearUsingSlope(2, 4, 4, 6, 6, 8);
        boolean collinearAreaSample = areCollinearUsingArea(2, 4, 4, 6, 6, 8);
        System.out.println("Collinear by slope? " + collinearSlopeSample);
        System.out.println("Collinear by area? " + collinearAreaSample);

        // User input for three points
        System.out.println("\nEnter points to check for collinearity:");
        System.out.print("Enter x1 y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        boolean collinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Are the points collinear?");
        System.out.println("Using slope formula: " + collinearSlope);
        System.out.println("Using area formula: " + collinearArea);
    }

    // Check collinearity using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Handle division by zero for slope
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // Allow a tolerance for floating point comparison
        double tolerance = 1e-9;

        return Math.abs(slopeAB - slopeBC) < tolerance &&
               Math.abs(slopeBC - slopeAC) < tolerance;
    }

    // Calculate slope of line segment between two points
    private static double calculateSlope(int x1, int y1, int x2, int y2) {
        if (x2 - x1 == 0) {
            // Vertical line slope considered infinite
            return Double.POSITIVE_INFINITY;
        }
        return (double)(y2 - y1) / (x2 - x1);
    }

    // Check collinearity using area formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) +
                             x2 * (y3 - y1) +
                             x3 * (y1 - y2));
        // If area is 0 or very close to 0, points are collinear
        double tolerance = 1e-9;
        return Math.abs(area) < tolerance;
    }
}
import java.util.Scanner;

public class q3_PerimeterOfTriangle {

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateRounds(double perimeter) {
        double distanceToRun = 5000.0; 
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter side 1 of the triangle (in meters): ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter side 2 of the triangle (in meters): ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter side 3 of the triangle (in meters): ");
            double side3 = scanner.nextDouble();

            
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
             
                double perimeter = calculatePerimeter(side1, side2, side3);
                double rounds = calculateRounds(perimeter);

                System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.\n", rounds);
            } else {
                System.out.println("The given sides do not form a valid triangle.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

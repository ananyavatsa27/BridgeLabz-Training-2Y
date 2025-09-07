import java.util.Scanner;

public class q10_BMICalculator {

    
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100;
            double bmi = weight / (heightMeters * heightMeters);
            data[i][2] = bmi;
        }
    }


    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // [weight, height(cm), BMI]

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        calculateBMI(data);

        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            String status = getBMIStatus(data[i][2]);
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n", i + 1, data[i][0], data[i][1], data[i][2], status);
        }

        scanner.close();
    }
}

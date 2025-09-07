public class q11_CalculateTrigonometry {

    
    public double[] calculateTrigonometricFunctions(double angle) {
        
        double radians = Math.toRadians(angle);


        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

 
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        q11_CaculateTrigonometry calculator = new q11_CaculateTrigonometry();

        double angle = 45.0;  

        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);
    }
}

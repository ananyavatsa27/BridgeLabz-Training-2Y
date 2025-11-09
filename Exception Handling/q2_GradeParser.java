public class q2_GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"};

        for (String grade : grades) {
            try {
                int value = Integer.parseInt(grade);
                System.out.println("Valid grade: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}

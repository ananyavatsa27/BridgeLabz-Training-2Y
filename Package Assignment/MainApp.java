import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Ananya Vatsa", 101);
        Faculty f = new Faculty("Dr. Mehta", "Computer Science");

        System.out.println("=== Student Details ===");
        s.displayStudentDetails();

        System.out.println("\n=== Faculty Details ===");
        f.displayFacultyDetails();
    }
}

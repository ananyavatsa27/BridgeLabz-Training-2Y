class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Course {
    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Course c1 = new Course("Mathematics", 201);

        System.out.println("Student: " + s1.getName() + ", ID: " + s1.getId());
        System.out.println("Course: " + c1.getCourseName() + ", Code: " + c1.getCourseCode());
    }
}
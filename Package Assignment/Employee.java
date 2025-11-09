import com.company.hr.*;
import com.company.payroll.*;

public class Employee{
    public static void main(String[] args) {
        Employee e = new Employee(101, "Ananya", "IT", 50000);
        Payroll p = new Payroll();

        System.out.println("=== Employee Salary Slip ===");
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Salary after Bonus: " + p.calculateBonus(e));
    }
}

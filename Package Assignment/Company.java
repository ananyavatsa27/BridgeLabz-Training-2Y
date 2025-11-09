import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class Company{
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();

        System.out.println("=== Company Analytics ===");
        s.showSales();
        e.showEmployees();
    }
}


import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Pracownik 1", 5000.0, 0);
        employees[1] = new Worker("Pracownik 2", 3000.0, "Worker 1");
        employees[2] = new Employee("Pracownik 3", 2000.0);
        employees[3] = new Employee("Pracownik 4", 2000.0);
        employees[4] = new Worker("Pracownik 5", 3000.0, "Worker 2");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

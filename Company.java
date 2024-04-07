import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Pracownik 1", 5000.0, 0);
        employees[1] = new Worker("Pracownik 2", 3000.0, "Worker 1");
        employees[2] = new Employee("Pracownik 3", 2000.0);
        employees[3] = new Employee("Pracownik 4", 2000.0);
        employees[4] = new Worker("Pracownik 5", 3000.0, "Worker 2");
        employees[5] = new Manager("Pracownik 6", 4500.0, 0);
        employees[6] = new Worker("Pracownik 7", 3500.0, "Worker 3");

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
        }

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        int managerCount = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                managerCount++;
            }
        }

        int subordinatesPerManager = nonManagerCount / managerCount;
        int extraSubordinates = nonManagerCount % managerCount;
        int managersProcessed = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                int subordinatesToAssign = subordinatesPerManager + (managersProcessed < extraSubordinates ? 1 : 0);
                ((Manager)employee).setNumberOfSubordinates(subordinatesToAssign);
                employee.setSalary(7500.0);
                managersProcessed++;
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}





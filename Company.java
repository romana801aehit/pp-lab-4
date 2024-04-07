public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Pracownik 1", 1000.0);
        employees[1] = new Employee("Pracownik 2", 2000.0);
        employees[2] = new Employee("Pracownik 3", 3000.0);
        employees[3] = new Employee("Pracownik 4", 4000.0);
        employees[4] = new Employee("Pracownik 5", 5000.0);

        System.out.println(employees[3]);

        employees[3].setSalary(4500.0);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Łukasz", 2200, 1, "2022-08-30", "Worker");
        Worker worker2 = new Worker("Michał", 2000, 2, "2023-10-1", "Worker");
        Worker worker3 = new Worker("Krzysiek", 2500, 3, "2024-01-01", "Worker");
        Worker worker4 = new Worker("Kuba", 2900, 4, "2021-07-01", "Worker");

        Manager manager = new Manager("Piotr", 4500, 5, "2021-08-30", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() +
                    " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}

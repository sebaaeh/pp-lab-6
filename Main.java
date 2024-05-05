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
        Worker worker4 = new Worker("Kuba", 2900, 3, "2021-07-01", "Worker");
        Worker worker5 = new Worker("Anna", 2600, 5, "2023-02-15", "Worker");
        Worker worker6 = new Worker("Tomasz", 2400, 6, "2024-04-20", "Worker");

        Manager manager1 = new Manager("Piotr", 4500, 7, "2021-08-30", "Manager");
        Manager manager2 = new Manager("Magda", 4800, 8, "2022-01-15", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalaryAllEmployees = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        double totalSalaryManagers = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToDouble(Employee::getSalary)
                .sum();

        double totalSalaryWorkers = employees.stream()
                .filter(employee -> employee instanceof Worker)
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("wszystkie pensje: " + totalSalaryAllEmployees);
        System.out.println("pensje menedżerów: " + totalSalaryManagers);
        System.out.println("pensje workerów: " + totalSalaryWorkers);

        for (Employee employee : employees) {
            long countSameId = employees.stream()
                    .filter(e -> e.getId() == employee.getId())
                    .count();
            if (countSameId > 1) {
                System.out.println("te samo id: " + employee.getName());
            }
        }
    }
}

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Łukasz", 2200, 1, "2022-08-30", "Worker");
        Worker worker2 = new Worker("Michał", 2000, 2, "2023-10-1", "Worker");
        Worker worker3 = new Worker("Krzysiek", 2500, 1, "2024-01-01", "Worker");
        Worker worker4 = new Worker("Kuba", 2900, 4, "2021-07-01", "Worker");

        Manager manager = new Manager("Piotr", 4500, 5, "2021-08-30", "Manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker1.getName() + " equals worker2: " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " equals worker3: " + worker1.equals(worker3));
        System.out.println(worker1.getName() + " equals manager: " + worker1.equals(manager));
    }
}

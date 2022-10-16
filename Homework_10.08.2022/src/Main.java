import java.util.EventListener;

public class Main {

    public static void main(String[] args) {

        Full_timeEmployee full_timeEmployee1 = new Full_timeEmployee("Ivanov", "Engineer", 5000.00);
        full_timeEmployee1.setBonus(550);

        Full_timeEmployee full_timeEmployee2 = new Full_timeEmployee("Petrov", "Mechanic", 4000.00);
        full_timeEmployee2.setBonus(350);

        ContractEmployee contractEmployee1 = new ContractEmployee("Sidorov", "Manager", 3700.00);

        ContractEmployee contractEmployee2 = new ContractEmployee("Vasechkin", "IT specialist", 5700.00);

//        Department department = new Department(4);

        System.out.println();

        Employee[] employees = new Employee[4];
        employees[0] = full_timeEmployee1;
        employees[1] = full_timeEmployee2;
        employees[2] = contractEmployee1;
        employees[3] = contractEmployee2;
        for (int i =0; i < employees.length; i++) {
            employees[i].calculateSalary();
        }
    }
}

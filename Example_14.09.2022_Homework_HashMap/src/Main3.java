import java.util.HashSet;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {
        Employee empoyee1 = new Employee("John", 20,1);
        Employee empoyee2 = new Employee("Ann", 20, 2);
        Employee empoyee3 = new Employee("John", 20, 1);
        Set<Employee> employees = new HashSet<>();
        employees.add(empoyee1);
        employees.add(empoyee2);
        employees.add(empoyee3);
        System.out.println(employees);


    }
}

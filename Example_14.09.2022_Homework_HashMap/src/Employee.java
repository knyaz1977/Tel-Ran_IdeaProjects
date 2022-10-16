public class Employee {

    private String name;
    private int salary;

    private int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, String title, double salary) {
        super(name, title, salary);
    }

    @Override
    void calculateSalary() {
        this.salary = salary;
        System.out.println("Salary of a contract employee " + title + " " + name + " is " + this.salary + " €");
    }


}

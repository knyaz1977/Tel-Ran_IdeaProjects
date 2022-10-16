public class Full_timeEmployee extends Employee {

    double bonus;

    public Full_timeEmployee(String name, String title, double salary) { // , double bonus
        super(name, title, salary);
//        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        this.salary = salary + this.bonus;
        System.out.println("Salary of a full-time employee " + title + " " + name + " is " + this.salary + " €");
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

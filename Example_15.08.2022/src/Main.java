public class Main {
    public static void main(String[] args) {
        Company company = new Company("TelRan");
        Department department = new Department("IT", company);

        Employee employee = new Employee("John2", "director", 123,department) {
            @Override
            public double calculateSalary() {
                return 0;
            }
        };

        ContractEmployee ce1 = new ContractEmployee("John", "post1", 123.1, department);
        ContractEmployee ce2 = new ContractEmployee("Ann", "post2", 1234.1, department);
        RegularEmployee re1 = new RegularEmployee("Victor", "post3", 12345.1, department);
        RegularEmployee re2 = new RegularEmployee("Hellen", "post4", 123456.1, department);
        System.out.println(department.getEmployeesCount());
        re1.setBonus(1000);
        re2.setBonus(1000);

        Employee[] employees = {ce1, ce2, re1, re2};

        for (int i = 0; i < employees.length; i++) {
            System.out.println("name; " + employees[i].getFio() + ", salary " + employees[i].calculateSalary());
        }
        // равнозначные циклы!!!

        System.out.println();

        for (Employee e : employees) { //в стиле for i
            // ; элемент синтекса
            System.out.println("name; " + e.getFio() + ", salary " + e.calculateSalary());
        }
    }
}

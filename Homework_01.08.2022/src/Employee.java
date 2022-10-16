public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void  printInfo() {
        System.out.println(fullName);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
    }

//    void information(Employee myEmployee) {
//        System.out.println(myEmployee.fullName + myEmployee.position + myEmployee.email + myEmployee.phone + myEmployee.salary + " " + myEmployee.age);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}

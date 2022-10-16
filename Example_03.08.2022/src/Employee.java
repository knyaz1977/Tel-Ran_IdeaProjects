public class Employee {

    String fullName;
    String post; // должность
    String email;
    String phone;
    double salary;
    int age;


    public Employee(String fullName, String post, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.print(fullName);
        System.out.print(post);
        System.out.print(email);
        System.out.print(phone);
        System.out.print(salary);
        System.out.print(age);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


}

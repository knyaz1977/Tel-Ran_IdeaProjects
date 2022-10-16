public class Employee {

//    public static void main(String[] args) {

    // Поля
    // public - модификатор доступа
    // private - закрытое поле
    // public - открытое поле (в любом месте проекта)
    public String name;
    public int age; // JVM выделит 4 байта
    public double salary; // 8 байт
    public char sex; // 'f', 'm'
    public String email;

    // Констукторы
    public Employee() {
        name = "noname";
        age = 25;
        salary = 25;
        sex = 'f';
        email = "noname@gmail.com";
    }

    public Employee(String name, int age, double salary, char sex, String email) {
        this.name = name;
        if (age < 0) {
            System.out.println("Error");
            this.age = -age;
        } else {
            this.age = age;
        }
        this.salary = salary;
        this.sex = sex;
        this.email = email;
    }


    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(email);
        System.out.println(salary);

    }

    // Свойства
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("ERROR!!!");
        }
        this.salary = salary;
    }
}


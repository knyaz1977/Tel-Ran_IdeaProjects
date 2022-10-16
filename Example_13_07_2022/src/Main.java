public class Main {

    public static void main(String[] args) {
        // Класс - это абстрактный тип данных, описывающий реальную сущность
        // и состоящий из полей и методов.
        int a; // Переменная a
        a = 4;
        Employee employeeJohn; // Создали переменную employee1 ссылочного типа Employee
        employeeJohn = new Employee(); // создание объекта класса Employee и установка ссылки employee1 на этот объект
        employeeJohn.name = "John";
        employeeJohn.age = 45;
        employeeJohn.sex = 'm';
        employeeJohn.email = "john@gmail.com";
        employeeJohn.salary = 123.45;
        System.out.println(employeeJohn.name);
        System.out.println(employeeJohn.age);
        System.out.println(employeeJohn.sex);
        System.out.println(employeeJohn.email);
        System.out.println(employeeJohn.salary);

        System.out.println();

        Employee employeeAnn;
        employeeAnn = new Employee();
        employeeAnn.name = "Ann";

        employeeAnn.sex = 'f';
        employeeAnn.email = "Ann@gmail.com";
        employeeAnn.salary = 123.45;
        System.out.println(employeeAnn.name);
        System.out.println(employeeAnn.age);
        System.out.println(employeeAnn.sex);
        System.out.println(employeeAnn.email);
        System.out.println(employeeAnn.salary);

        Employee employee3 = employeeJohn; // employee3 тоже ссылается на EmployeeJohn
        // без выделения дополнительной памяти. т.к. не создается новый объект
        System.out.println(employee3.name);
        employee3.name = "Vic";
        System.out.println(employee3.name);
        System.out.println(employeeJohn.name);

        employeeJohn.age = -100;


    }
}

public class Main {

    public static void main(String[] args) {
//                First level: 1. Создайте класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст.
                //Сделайте так, чтобы конструктор класса заполнял эти поля при создании объекта.
                //
                //Внутри класса «Сотрудник» напишите метод, который выводит информацию об объекте в консоль.
                //
                //Создайте массив из пяти сотрудников. Например:
                //Person[] persArray = new Person[5];
                //// Вначале объявляем массив объектов
                //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
                //// потом для каждой ячейки массива задаём объект
                //persArray[1] = new Person(…);
                //…
                //persArray[4] = new Person(…);
                //
                //Используя цикл, выведите информацию только о сотрудниках старше 40 лет.
        Employee employee1 = new Employee("qwerty1", "asd1", "qwerty1@gmail.com", "1234", 1231.45, 30);
//        employee1.printInfo();
        System.out.println();
        Employee employee2 = new Employee("qwerty2", "asd2", "qwerty2@gmail.com", "12345", 1232.45, 35);
        Employee employee3 = new Employee("qwerty3", "asd3", "qwerty3@gmail.com", "12346", 1233.45, 40);
        Employee employee4 = new Employee("qwerty4", "asd4", "qwerty4@gmail.com", "12347", 1234.45, 45);
        Employee employee5 = new Employee("qwerty5", "asd5", "qwerty5@gmail.com", "12348", 1235.45, 50);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
//                employees[i].printInfo();
            }

        }
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                System.out.println(employees[i]);
            }

        }


    }
}
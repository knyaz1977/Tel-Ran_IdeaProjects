public class Main {

    public static void main(String[] args) {
// First level: 1. Создайте класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст.
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

        Employee myEmployee = new Employee("Ivanov Ivan ", "Engineer ", "ivivan@mailbox.com ", "892312312 ", 30000, 30);
        myEmployee.printInfo();
        System.out.println();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petja", "Programmer", "petrov@mailbox.com", "891234567", 60000, 52);
        persArray[2] = new Employee("Vasechkin Vasja", "Carpenter", "vasechkin@mailbox.com", "897654321", 28000, 27);
        persArray[3] = new Employee("Ignatov Ignat", "Electrician", "ignatov@mailbox.com", "897564231", 80000, 60);
        persArray[4] = new Employee("Ilushev Il'ja", "Machinist", "ilushev@mailbox.com", "896745213", 56000, 44);
        System.out.println("Employees over 40 years old:");
        for (int i = 0; i < persArray.length; i++) { // Первый вариант вывода
            if (persArray[i].age > 40) {
                persArray[i].printInfo();
            }
        }
        for (int i = 0; i < persArray.length; i++) { // Второй вариант вывода
            if (persArray[i].age > 40) {
                System.out.println(persArray[i]);

            }
        }
    }
}
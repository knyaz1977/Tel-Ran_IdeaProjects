import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Написать метод, который выводит в консоль строку "Hello, Java!"
        printName();

        // Написать метод, который принимает имя человека и выводит строку
        printHello("Victor");
        printHello("Anna");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name");
        String name = scanner.nextLine();
        printHello(name);

        int k = sum(10, 20); // k=30
        System.out.println(k);
        System.out.println(sum(30,40));
        System.out.println(sum(3.14,1.0));
    }
    // private - приватный метод

    // public - модификатор доступа (открытый метод)
    // static - метод статический (объяснение позже, ООП)
    // тип данных возвращаемого значения(void - нет возвращаемого значения)(8 примитивных типов данных: Int,...)
    // имя метода (с маленькой буквы, camelCase)
    // в круглых скобках указываются принимаемые параметры, если их нет, то скобки пус

    private static void printName() {
        System.out.println("Hello, Java!");
    }

    private static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
    // перегрузка методов - механизм создания двух и более методов с одним именем внутри одного класса, но отличающихся числом и/или типом параметров
    // метод принимает два целых числа, складывает их и возвращает сумму
    private static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    private static double sum(double a, double b) {
        return a + b;
    }
    //Параметры метода - то, что находится в ( )
    //Тело метода - то, что находится в { }

}

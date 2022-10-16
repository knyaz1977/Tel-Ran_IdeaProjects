import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Написать метод, который выводит в консоль строку "Hello, Java!"
        printName();
        // написать метод, который принимает имя человека и выводит строку
        // "Hello, имя!" в консоль
        printHello("Victor");
        printHello("Anna");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name");
        String name = scanner.nextLine();
        printHello(name);

        System.out.println("Input Number1");
        double number1 = scanner.nextDouble();
        System.out.println("Input Number2");
        double number2 = scanner.nextDouble();
        System.out.println(sum((int) number1, (int) number2));

        //int k = sum(10, 20); // k = 30
        //System.out.println(k);


    }

    // 1.public/private - модификатор доступа
    // 2. static - метод статический
    // 3.тип данных возвращаемого значения(int,double,..., void - нет возвращаемого значения(нет никаких вычислений))
    // 4. имя метода (с маленькой буквы, camelCase (горб верблюда)
    // 5. в круглых скобках указываются принимаемые параметры, если их нет, то скобки пустые

    private static void printName() {
        System.out.println("Hello, Java!");
    }

    private static void printHello(String name) {
        System.out.println();
        System.out.println("Hello, " + name + "!");
    }

    // метод принимает два целых числа, складывает их и возвращает сумму
    private static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}

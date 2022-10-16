import java.util.Scanner;

public class Main3 {

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
        }
        private static void printName() {
            System.out.println("Hello, Java!");
        }
        private static void printHello(String name) {
            System.out.println("Hello, " + name + "!");
        }

    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task1
        // Напишите метод, который принимает строку и два символа.
        // В результате он возвращает заданную строку, где каждый первый символ был заменен вторым символом.
        // Вы должны использовать только методы length() и charAt() класса String. Например:
        // “Я всегда делаю свою домашнюю работу”, “а”, "А" -> "Я всегда делаю свою домашнюю работу"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String str = scanner.next();
        System.out.println("Input two characters");

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);

        returnString(str, a, b);
    }

    private static void returnString(String str, char a, char b) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                System.out.print(b);
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}


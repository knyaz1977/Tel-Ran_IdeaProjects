import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // Second level
        // Task4
        // Второй уровень: Тема "Циклы":
        // Метод записи, который проверяет, является ли данная строка палиндромом.
        // Палиндром - это фраза, которая читается одинаково спереди и сзади.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String str = scanner.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            char s = str.charAt(i);
            for (int y = str.length() - 1 - i; y < str.length(); y++) {
                char s2 = str.charAt(y);
                if (s2 != s) {
                    System.out.println("This string is not a palindrome");
                    return;
                }
                break;
            }
        }
        System.out.println("This string is a palindrome");
    }
}
//
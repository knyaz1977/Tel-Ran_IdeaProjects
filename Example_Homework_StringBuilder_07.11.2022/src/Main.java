import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Level 1: 1. Дано два числа, например 3 и 56,
        // необходимо составить следующие строки: 3 + 56 = 59
        // 3 – 56 = -53 3 * 56 = 168.
        // Используем метод StringBuilder.append().

        // 2. Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.insert(),
        // StringBuilder.deleteCharAt().

        // 3. Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.replace()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a");
        int a = scanner.nextInt();
        System.out.println("Input number b");
        int b = scanner.nextInt();
        StringBuilder first = getString(a, b, '+', a + b);
        StringBuilder second = getString(a, b, '-', a + b);
        StringBuilder third = getString(a, b, '*', a + b);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(replaceEquals1(first));
        System.out.println(replaceEquals1(second));
        System.out.println(replaceEquals1(third));
        System.out.println(replaceEquals2(first));
        System.out.println(replaceEquals2(second));
        System.out.println(replaceEquals2(third));

    }

    private static StringBuilder getString(int a, int b, char op, int result) {
        return new StringBuilder()
                .append(a)
                .append(op)
                .append(b)
                .append('=')
                .append(result);
    }

    private static StringBuilder replaceEquals1(StringBuilder sb) {
        int idx = sb.indexOf("=");
        return sb.deleteCharAt(idx).insert(idx, " равно ");
    }

    private static StringBuilder replaceEquals2(StringBuilder sb) {
        int idx = sb.indexOf("=");
        return sb.replace(idx, idx + 1, " равно ");
    }
}

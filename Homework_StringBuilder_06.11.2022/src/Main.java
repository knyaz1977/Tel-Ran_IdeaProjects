import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // First level: 1. Дано два числа, например 3 и 56,
        // необходимо составить следующие строки:
        //3 + 56 = 59
        //3 – 56 = -53
        //3 * 56 = 168.
        //Используем метод StringBuilder.append().
        System.out.println("Input +, -, or *");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();
        String str1 = "3";
        String str2 = "56";

        StringBuilder sb = new StringBuilder(str1);

        int a = Integer.parseInt(str1.trim());
        int b = Integer.parseInt(str2.trim());

        for (char i : c) {
            if (i == '+') {
                int z = a + b;
                conversion(c, sb, b, z);
            } else if (i == '-') {
                int z = a - b;
                conversion(c, sb, b, z);
            } else if (i == '*') {
                int z = a * b;
                conversion(c, sb, b, z);
            }
        }

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        String str3 = "=";
        StringBuilder sb1 = new StringBuilder(str3);
        System.out.println(sb1.deleteCharAt(0).insert(0, "равно"));

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()
        StringBuilder sb2 = new StringBuilder(str3);
        System.out.println(sb2.replace(0, 1, "равно"));

    }

    private static void conversion(char[] c, StringBuilder sb, int b, int z) {
        System.out.println(sb.append(" ")
                .append(c)
                .append(" ")
                .append(b)
                .append(" = ")
                .append(z));
    }
}

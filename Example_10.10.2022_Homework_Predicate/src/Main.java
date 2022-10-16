import java.util.Locale;
import java.util.function.Predicate;

public class Main {
    // First level:
    // Написать программу, которая проверяет, что строка начинается
    // буквой “J” или “N” и заканчивается “A”.
    // Используем функциональный интерфейс Predicate.

    public static void main(String[] args) {
        Predicate<String> predicate = s -> {
            String s2 = s.toUpperCase();
            return (s2.startsWith("J")
                    || s2.startsWith("N"))
                    && s2.endsWith("A");
        };
        System.out.println(predicate.test("Java"));
        System.out.println(predicate.test("Nava"));
        System.out.println(predicate.test("Qava"));

    }
}

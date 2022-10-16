import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {
        // 1. Написать функциональный интерфейс с методом,
        // который принимает две строки и возвращает тоже строку.
        // Написать реализацию такого интерфейса в виде лямбды,
        // которая возвращает ту строку, которая длиннее.

//        StringComparable stringComparable = (s1, s2) -> (s1.length() > s2.length()) ? s1 : s2;
        StringComparable stringComparable = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };
        System.out.println(stringComparable.compare("qwerty", "q"));
        System.out.println(stringComparable.compare("", "q"));

        //////////////////////////
        // Тернарный оператор
        int a = 1, b = 2, max;
        if (a > b) {
            max = a;

        } else {
            max = b;
        }
        int max2 = (a > b) ? a : b; // Если a > b то(?) max2 = a иначе(:) max2 = b
        ///////////////////////////

        Predicate<String> isNotNull = (String s) -> {
            if (s != null) {
                return true;
            } else {
                return false;
            }
        };
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        Predicate<String> predicate = isNotNull.and(isNotEmpty);

        Predicate<String> anotherPredicate = s -> s != null && !s.isEmpty();

        System.out.println(predicate.test("qwerty"));
        System.out.println(predicate.test(""));
        System.out.println(predicate.test(null));

        System.out.println(maxSubstringLength("abcabcbb"));
        System.out.println(maxSubstringLength("bbbbb"));
        System.out.println(maxSubstringLength("pwwkew"));
    }

    private static int maxSubstringLength(String s) {
        Set<Character> usedSymbols = new HashSet<>();
        int i = 0, j = 0, len = s.length(), answer = 0;
        while (i < len && j < len) {
            char c = s.charAt(j);
            if (!usedSymbols.contains(c)) {
                usedSymbols.add(c);
                j++;
                answer = Math.max(answer, j - i);
            } else {
                usedSymbols.remove(s.charAt(i));
            }
        }
        return answer;
    }
}

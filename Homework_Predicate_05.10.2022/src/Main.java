import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    // First level:
    // Написать программу, которая проверяет, что строка начинается
    // буквой “J” или “N” и заканчивается “A”.
    // Используем функциональный интерфейс Predicate.
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        Collections.addAll(list1, 1,12,13,25);
//        System.out.println(list1);
//        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Hello", "Java", "Spring", "Nevada");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);

            Predicate chek;
            chek = x -> {
                char[] chars = str.toUpperCase().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if ((chars[j] == 'J' || chars[j] == 'N') && chars[chars.length - 1] == 'A') {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            };

            boolean result = chek.test(str);
            System.out.println(result);
        }
    }
}

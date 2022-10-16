import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

    }
    private static int searchUniqueChar2(String s) {
        int index = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < length; j++) {
                // Нужно проверить, что мы не проверяем символ сам
                // с собой
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    // Символ с1 не уникальный
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return index;
    }

    private static int searchUniqueChar3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    private static void printUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("No unique char");
    }
}
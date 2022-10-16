import org.w3c.dom.ls.LSOutput;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(searchUniqueChar("leetcode"));
        System.out.println(searchUniqueChar("loveleetcodv"));
        System.out.println(searchUniqueChar("aabb"));
    }

    private static int searchUniqueChar(String s) {
        int index = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);
            int j;
            for (j = 0; j < length; j++) {
                // Нужно проверить, что мы не проверяем символ сам
                // с собой
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    // Символ с1 не уникальный
                    break;
                }
            }
            if (j == length) {
                return i;
            }
        }
        return index;
    }

}

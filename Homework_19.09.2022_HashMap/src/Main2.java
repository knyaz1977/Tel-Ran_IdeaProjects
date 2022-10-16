import java.util.SortedMap;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(searchUniqueChar("leetcode"));
    }

    private static  int searchUniqueChar(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
           char c1 = s.charAt(i);
           for (int  j = 0; j < s.length(); j++) {
               // Нужно проверить, что мы не проверяем символ сам с собой
               if (i == j) {
                   continue;
               }
               char c2 = s.charAt(j);
               if (c1 == c2) {
                   // Символ с1 не уникальный
                   break;
               }
           }


        }
        return index;
    }


}

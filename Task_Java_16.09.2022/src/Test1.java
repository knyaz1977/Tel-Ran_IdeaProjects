import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Set<String> notTranslateWords = new LinkedHashSet<>();
        notTranslateWords.add("a");
        notTranslateWords.add("the");
        notTranslateWords.add("a");
        notTranslateWords.add(" ");
        notTranslateWords.add("the");

        List<String> list = new ArrayList<>(notTranslateWords);

        // Вывод множества (set) в алфавитном порядке
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hi".toUpperCase(Locale.ROOT), "Привет");
        dictionary.put("Hello".toUpperCase(Locale.ROOT), "Привет");
        dictionary.put("World".toUpperCase(Locale.ROOT), "Мир");
        dictionary.put("Ivan".toUpperCase(Locale.ROOT), "Иван");
        dictionary.put("Car".toUpperCase(Locale.ROOT), "Машина");

         //Вывод ключей
        for(String word: dictionary.keySet()) {
            System.out.println(word);
        }
        System.out.println();
        for (String word : dictionary.values()) {
            System.out.println(word);
        }
    }
}
// Set<String> notTranslateWords = new TreeSet<>();
//        notTranslateWords.add("a");
//        notTranslateWords.add("the");
//        notTranslateWords.add("a");
//        notTranslateWords.add(" ");
//        notTranslateWords.add("the");
//
//        List<String> list = new ArrayList<>(notTranslateWords);
//
//        // Вывод множества (set) в алфавитном порядке
//        for(String s: list) {
//            System.out.println(s);
//        }
// Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("Hi".toUpperCase(Locale.ROOT), "Привет");
//        dictionary.put("Hello".toUpperCase(Locale.ROOT), "Привет");
//        dictionary.put("World".toUpperCase(Locale.ROOT), "Мир");
//        dictionary.put("Ivan".toUpperCase(Locale.ROOT), "Иван");
//        dictionary.put("Car".toUpperCase(Locale.ROOT), "Машина");
//
//        // Вывод ключей
//        for(String word: dictionary.keySet()) {
//            System.out.println(word);
//        }
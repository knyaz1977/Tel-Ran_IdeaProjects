import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main3 {
        public static void main(String[] args) {
                // Hi = Привет
                // World = Мир
                // Ivan = Иван
                // Car = машина
                Map<String, String> dictionary = new HashMap<>();
                dictionary.put("Hi", "Привет");
                dictionary.put("Hello", "Привет");
                dictionary.put("World", "Мир");
                dictionary.put("Ivan", "Иван");
                dictionary.put("Car", "Машина");

                Set<String> notTranslateWords = new HashSet<>();
                notTranslateWords.add("a");
                notTranslateWords.add("the");
                notTranslateWords.add(" ");

                String str = "Hello the World! Hi, a Car !";

                String[] words = str.replace(",", "")
                        .replace("!", "").split(" ");

                StringBuilder builder = new StringBuilder();
                for(String word: words) {
                        if(!notTranslateWords.contains(word)) {
                                builder.append(dictionary.get(word)).append(" ");
//                                System.out.println(dictionary.get(word));
                        }
                }
                System.out.println(builder.toString());

        }
}

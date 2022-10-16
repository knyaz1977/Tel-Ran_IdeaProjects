import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String str = "Hello world! Hi world! Hello Ivan!";
        String stringWithSpace = str.replace("!", " ").replace(" ", " ");
        String[] words = stringWithSpace.split(" ");

        Map<String, Long> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.putIfAbsent(word, 0L); // 0- это int. L потому,
            // что используем Long и мы делаем преобразование Integer в Long.

            Long cnt = wordsCount.get(word);
            wordsCount.put(word, cnt + 1);

//            System.out.println(word);
        }
        System.out.println(wordsCount);
    }
}

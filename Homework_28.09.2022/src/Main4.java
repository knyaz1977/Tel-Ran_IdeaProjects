import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main4 {

    public static void main(String[] args) {
        // Stream API
        // императивное программирование - функциональное программирование
        // Найти сумму всех нечетных элементов коллекции
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int i : list) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        int sum2 = list.stream()
                .filter(o -> o % 2 != 0) //
                .reduce((s1, s2) -> s1 + s2) // терминальный
                .orElse(0);
        System.out.println(sum2);

        // Способы получения Stream
        Stream.empty(); // Пустой стрим
        list.stream(); // Стрим из списка list
        Map<Integer, String> map = new HashMap<>();
        map.entrySet().stream(); // стрим из ассоциативного массива map. entry содержимое
        String[] array = {"qwerty", "asd"};
        Arrays.stream(array); // Строки из массива
        Stream.of(1,2,3,4,5); //

    }
}

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // First level: Дан список строк. С помощью Stream API
        // найти самую длинную строку.

        Stream<String> stream = Stream.of("qwerty", "asd");

        Optional<String> largest = stream.max(Comparator.comparing(String::length)); // нахождение самой длинной строки
        System.out.println(largest);
    }
}

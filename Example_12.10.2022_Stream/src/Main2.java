import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, -1, -2, 3, 5);
        // takeWhile на подобии filter, работает до первого неподходящего условию элемента.
        numbers.takeWhile(n -> n > 0)
                .forEach(System.out::println);

        System.out.println();

        // Поток numbers закрыт и работать с ним больше нельзя
//        numbers.dropWhile(n -> n > 0)
//                .forEach(System.out::println);

        // dropWhile пропускает эл-ты потока до первого эл-та, который не соответствует условию.
        Stream.of(1, 2, 3, -1, -2, 3, 5)
                .dropWhile(n -> n > 0)
                .forEach(System.out::println);

        // concat - объединяет потоки в один
        Stream<String> stream1 = Stream.of("one", "two");
        Stream<String> stream2 = Stream.of("three", "four");
        Stream.concat(stream1, stream2).forEach(System.out::println);

        System.out.println();
        // skip(n) - пропуск  n элементов
        // limit (n) - выборка первых n элементов
        Stream.of(1, 2, 3, -1, -2, 3, 5)
                .skip(1) // Пропустить 1 элемент
                .limit(3) //Вывести только 3 элемента
                .forEach(System.out::println);
        System.out.println();

        // allMatch, anyMatch, noneMatch
        // Есть ли в потоке меньшее нуля.
        boolean result = Stream.of(1, 2, 3, -1, -2, 3, 5)
                .anyMatch(n -> n < 0);
        System.out.println(result);
        System.out.println();

        // Являются ли все числа в потоке отрицательными.
        System.out.println(Stream.of(1, 2, 3, -1, -2, 3, 5)
                .allMatch(n -> n < 0));
        System.out.println();

        // Нет ли в потоке числа ноль. Если нет, то true
        System.out.println(Stream.of(1, 2, 3, -1, -2, 3, 5)
                .noneMatch(n -> n == 0));
        System.out.println();

        // min, max - обратить внимание на параметр Comparator
        System.out.println(Stream.of(1, 2, 3, -1, -2, 3, 5)
                .min(Integer::compareTo)
                .orElse(0));
        System.out.println();

        // reduce
        // 1 op 2 op 3 op -1 ... op-операция, в данном примере умножение.
        System.out.println(Stream.of(1, 2, 3, -1, -2, 3, 5)
                .reduce((x, y) -> x * y)
                .get()
        );
        System.out.println();

        System.out.println(Stream.of("one", "two")
                .reduce((x, y) -> x + " " + y)
                .get());

        List<Integer> resultList = Stream.of(1, 2, 3, -1, -2, 3, 5)
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        System.out.println("resultList " + resultList);
        // Collectors.toSet()
        System.out.println();

        Stream<Phone> phoneStream = Stream.of(new Phone("phone1", 10),
                new Phone("phone2", 20));
        Map<String, Integer> map = phoneStream
                .collect(Collectors.toMap(Phone::getName, Phone::getPrice)); // p->p.getName(), t->t.getPrice()
        System.out.println("map " + map);
        System.out.println();

        // flatMap
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int[] newArray = Arrays.stream(array)
                .flatMapToInt(n -> Arrays.stream(n))// flatMapToInt разворачивает массив в целые числа
                .toArray(); // можно собирать элементы потока в массив
        System.out.println(Arrays.toString(newArray));

    }
}
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // First level: 1. Определить количество четных чисел в потоке данных.
        long count1 = IntStream.of(-7, -3, 0, 2, 4, 5, 7, 8).filter(a -> a % 2 == 0).count();
        System.out.println(count1);
        System.out.println();

        long count3 = Stream.of(-7, -3, 0, 2, 4, 5, 7, 8)
                .filter(a -> a % 2 == 0)
                .count();
        System.out.println(count3);

        // 2. Задано множество фамилий сотрудников. Разработать программу,
        // которая отображает все фамилии, начинающиеся на букву «J».
        ArrayList<String> surnames = new ArrayList<>();
        Collections.addAll(surnames, "Jackson", "Raabe", "Jordan");
        surnames.stream() // получаем поток
                .filter(s -> s.startsWith("J")) // Применяем фильтр по началу слова
                .forEach(System.out::println); // Выводим отфильтрованные строки
        // filter -  промежуточная операция
        // forEach - терминальная
        System.out.println();

        Set<String> names = new HashSet<>();
        names.add("Johnson");
        names.add("Black");
        names.add("White");
        names.stream()
                .filter(s -> s.startsWith("J")) // s -> s.charAt(0) == 'J
                .forEach(System.out::println);

//        ArrayList<String> name = new ArrayList<>();
//        Collections.addAll(name, "Franklin","Daniela", "Alexandr");
//        name.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

        // 3.Пусть дана коллекция состоящая из строк. Arrays.asList(«Highload», «High», «Load», «Highload»)
        // а) Вывести, сколько раз объект «High» встречается в коллекции.
        List<String> array = new ArrayList<>(Arrays.asList("Highload", "High", "Load", "Highload"));
        long countHigh = array.stream()
                .filter(s -> s.startsWith("High")) // filter - интермедия
                .filter("High"::equals) // аналогичный фильтр .filter(s->s.equals("High"))
                .count();
        System.out.println(countHigh);
        System.out.println();
        // б) Какой элемент в коллекции находится на первом месте?
        // Если мы получили пустую коллекцию, то пусть возвращается 0.

        Stream<Test> testStream = Stream.of(
                new Test("Highload"),
                new Test("High"),
                new Test("Load"),
                new Test("Highload")
        );
//        Stream<Test> testStream = Stream.of();

        Optional<Test> first = testStream.findFirst(); // Optional - данный объект может и не существовать
        if (first.isPresent()) {
            System.out.println(first.get().getName());
        } else {
            System.out.println(0);
        }
        System.out.println();

        // Варианты Антона:
        String firstName = array.stream()
                        .findFirst()
                        .orElse(String.valueOf(0)); // orElse - иначе
        System.out.println("firstName " + firstName);

        Optional<String> optFirstName = array.stream()
                        .findFirst();
        if (optFirstName.isPresent()) { // isPresent - если это значение существует
            System.out.println(optFirstName.get());
        }else {
            System.out.println(0);
        }

        // 4. Дана коллекция Arrays.asList("f10", "f15", "f2", "f4", "f4").
        // Нужно выполнить сортировку в обратном алфавитному порядке и удалить дубликаты.
        // В массиве должны оказаться только уникальные значения
        Arrays.asList("Daniel", "Argentina", "Uruguay", "Piter", "Piter")
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder()) // можно использовать Collections
                .forEach(System.out::println); // Collections.reverseOrder() -сортировка в обратную сторону.

        System.out.println();

//      List<String> arrayList = new ArrayList<>(Arrays.asList("f10", "f15", "f2", "f4", "f4"));
        // Запись короче ниже!
        List<String> sortedList = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        sortedList.stream()
                .distinct() // убирает дубли
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList()); // запись в новый List

        System.out.println(sortedList);
    }
}

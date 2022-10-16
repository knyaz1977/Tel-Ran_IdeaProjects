import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "Berlin", "London");
        cities.stream() // получаем поток
                .filter(s -> s.startsWith("L")) // Применяем фильтр по началу слова
                .forEach(System.out::println); // Выводим отфильтрованные строки
        //  filter -  промежуточная операция
        // forEach - терминальная
        System.out.println();
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1", 55000),
                new Phone("phone2", 45000),
                new Phone("phone3", 40000)
        );
        System.out.println();
        phoneStream.filter(phone -> phone.getPrice() < 50000)
                .forEach(phone -> System.out.println(phone.getName()));
        System.out.println();
        // map
        Stream<Phone> phoneStream2 = Stream.of(
                new Phone("phone1", 55000),
                new Phone("phone2", 45000),
                new Phone("phone3", 40000)
        );
        phoneStream2.map(phone -> phone.getName())
                .forEach(s -> System.out.println(s));
        System.out.println();

        Stream<Phone> phoneStream3 = Stream.of(
                new Phone("phone1", 55000),
                new Phone("phone2", 45000),
                new Phone("phone3", 40000)
        );
        System.out.println();
        phoneStream3.map(Phone::getName)// замена - phone -> phone.getName()
                // можно подставить вместо map(Phone::getName) - map(p -> "name: " + p.getName()  + ", price: " + p.getPrice());
//                .filter(s -> s.)
                .forEach(System.out::println); // замена - s -> System.out.println(s)


        Stream<Phone> phoneStream4 = Stream.of(
                new Phone("phone1", 55000),
                new Phone("phone2", 45000),
                new Phone("phone3", 40000)
        );
        System.out.println();
        phoneStream4.mapToInt(Phone::getPrice)// замена - phone -> phone.getPrice()
                .forEach(System.out::println); // замена - s -> System.out.println(s)
        System.out.println();
        Stream<Phone> phoneStream5 = Stream.of(
                new Phone("phone1", 55000),
                new Phone("phone2", 45000),
                new Phone("phone3", 40000)
        );
        Optional<Phone> first = phoneStream5.findFirst(); // Optional - данный объект может и не существовать
        if (first.isPresent()) {
            System.out.println(first.get().getName());
        }
        //Неправильная запись
        //Phone firstPhone = phoneStream5.findFirst().get();

        System.out.println();
        Stream<Phone> phoneStream6 = Stream.of(
                new Phone("phone1", 55000),
                new Phone("phone2", 45000),
                new Phone("phone3", 40000)
        );
        System.out.println();
        int minPrice = phoneStream6.mapToInt(Phone::getPrice).min().orElse(0);
        // нашли минимальную цену, если она не была найдена, то возвращается 0
        // min(), max(), sum() - терминальные операции

    }
}
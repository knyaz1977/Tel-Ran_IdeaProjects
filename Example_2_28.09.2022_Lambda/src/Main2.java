import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {

    public static void main(String[] args) {
        A<Integer> a = new A<>();
        a.value = 1;
        a.show(2);
        A<String> s = new A<>();
        s.value = "qwerty";

        // Predicate - предикат
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0; // isEvenNumber - проверка является Четным Числом
        // чтобы его увидеть
        System.out.println(isEvenNumber.test(4)); // test находится в Predicate() (Ctrl+Enter),
        System.out.println(isEvenNumber.test(3));

        isEvenNumber
                .and(x -> x / 2 == 3)
                .or(x -> x - 2 == 1)
                .negate();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.stream().filter(isEvenNumber); // передаем (isEvenNumber = x -> x % 2 == 0)
        // Метод filter вызывает у Predicate test.

        // Consumer - потребитель
        Consumer<String> greetings = x -> System.out.println("Hello, " + x);
        greetings.accept("Victor");
//        Consumer<Integer> errorConsumer = () -> x -> x % 2 == 0; // Нельзя, т.к. Consumer не возвращаемый
        // Consumer - это тоже самое, что метод
        // private  static void print(String s) {
        //    System.out.println(s);
        // }
        // Supplier -поставщик - функциональный интерфейс, не принимает никаких аргументов,
        // но возвращает объект типа T

        ArrayList<String> nameList = new ArrayList<>(); // Список имен
        nameList.add("Elena");
        nameList.add("Alexandr");
        nameList.add("Irina");
        nameList.add("Victor");
        Supplier<String> randomName = () -> { // будем получать рандомные имена
            int index = (int) (nameList.size() * Math.random());
            return nameList.get(index);
        };
        System.out.println(randomName.get());

        //Function - функция
        Function<String, Integer> converter = x -> Integer.valueOf(x);
        System.out.println(converter.apply("123"));

        Function<Dog, Raccon> converterDogToRaccon = x -> {
            return new Raccon(x.name, x.age, x.weight);
        };
        Raccon raccon = converterDogToRaccon.apply(
                new Dog("Bobik", 10, 20)
        );


    }
}

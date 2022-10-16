import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 2, 34, 14, 67, 23, 2);
        // else {
        //                System.out.print(integer + " ");
        //
        //            }
        for (Integer integer1 : list) {
            if (integer1 % 2 == 0) {
                String s = (integer1 + 2) + " ";
                System.out.print(s);
            }
        }
        System.out.println();
        list.stream().filter(integer -> integer % 2 == 1).map(integer -> integer + " ").forEach(System.out::print);
        System.out.println();
        list.stream()
                .filter(p -> p % 2 == 0)
                .forEach(p -> System.out.print((p + 2) + " "));

        System.out.println();
        Predicate<String> predicate1 = t -> {
            System.out.print("predicate1");
            return t.startsWith(" ");
        };
        Predicate<String> predicate2 = t -> {
            System.out.print("predicate2");
            return t.length() > 6;
        };
        predicate1.and(predicate2).test("Hello world!!!");
        System.out.println();

        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ACCD"));
    }

}
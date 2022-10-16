public class Main {

    public static void main(String[] args) {
        // First level: Написать лямбда выражение для интерфейса Printable,
        // который содержит один метод void print().
        //
        //Second level: Написать функциональный интерфейс с методом,
        // который принимает число и возвращает булево значение.
        // Написать реализацию такого интерфейса в виде лямбда-выражения,
        // которое возвращает true если переданное число делится без остатка на 13.

        Conceptable concept;

        concept = (x) -> (x % 13) == 0;
//            if () {
//                return 1;
//            } else {
//                return -1;
//            }
//        };
        int result = concept.item(23);
        System.out.println(result);

    }

    @FunctionalInterface
    interface Conceptable {
        int item(int x);
    }
}

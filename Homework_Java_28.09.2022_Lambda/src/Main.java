public class Main {
    // First level: 1. Написать функциональный интерфейс с методом,
    // который принимает две строки и возвращает тоже строку.
    // Написать реализацию такого интерфейса в виде лямбды,
    // которая возвращает ту строку, которая длиннее.
    public static void main(String[] args) throws Exception {

        MyPredicate myPredicate = x -> {
            if(x > y)
            return x > y;
        };
        System.out.println(myPredicate.test("qwerty", "asdf"));

    }
}
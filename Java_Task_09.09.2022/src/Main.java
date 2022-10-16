import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        String s1 = new String("My string");
        String s2 = new String("My string");

        if (s1 == s2) { // неверное сравнение ==
            System.out.println("Числа равны");

        } else {
            System.out.println("Числа не равны");
        }
        System.out.println();
        if (s1.equals(s2)) { // верное сравнение equals
            System.out.println("Числа равны");

        } else {
            System.out.println("Числа не равны");
        }
    }
}

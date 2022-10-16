package Task1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Hello", "Java", "Spring");

        list.forEach(s -> System.out.println(s));
        // 2. Создать переменную типа Operationable
        Operationable operation;

        // 3. Присвоить этой переменной реализацию метода calculate
        // с помощью лямбд
        Operationable operation1 = (int x, int y) -> x + y; // int можно убрать
        operation = (x, y) -> {
            for (int i = 0; i < 10; i++) {
                if (x + y > 0) {
                    return x - y;
                } else {
                    return y - x;
                }
            }
            return 0;
        };
        Operationable operation2 = (x, y) -> x - y;
        // 4. Теперь можно обратиться к методу calculate интерфейса Operationable
        // через переменную operation
        int result = operation1.calculate(12, 3);
        System.out.println(result);
        // Test Anton
    }

    // 1. Создать функциональный интерфейс
    @FunctionalInterface
    interface Operationable {
        int calculate(int x, int y);
    }
}

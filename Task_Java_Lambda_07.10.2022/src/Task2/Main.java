package Task2;

import javax.crypto.spec.PSource;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Operationable> operations = new ArrayList<>();
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+') {
                operations.add((a, b) -> a + b);
            } else if (c == '-') {
                operations.add((a, b) -> a - b);
                // c - цифра
            } else {
                numbers.add(Integer.parseInt("" + c));
            }
        }
        int result = 0;
        for (int i = 0; i < numbers.size(); i += 2) {
            int a = numbers.get(i);
            int b = numbers.get(i + 1);
            Operationable operation = operations.get(i);
            result = result + operation.perform(a, b);
        }
        System.out.println(result);
    }
}

@FunctionalInterface
interface Operationable {
    int perform(int s, int b);
}

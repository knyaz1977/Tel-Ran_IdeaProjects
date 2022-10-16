import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        // Первый уровень: 1. Реализуйте метод, который возвращает новый массив int.
        // Каждый элемент массива равен следующей степени двойки.
        // Длина массива задается n (максимальное значение n равно 30.
        // Как вы думаете, почему?)PowerOfTwo (5) -> {1,2,4,8,16}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n <= 30");
        int n = scanner.nextInt();
        if (n <= 30) {
            arraySecond(n);
        } else {
            System.out.println("Invalid value entered! n should be !> 30");
        }
    }
    private static void arraySecond(int n) {
        int [] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[0] = 1;
            array[i] = array[i-1] * 2;
        }
        System.out.println(Arrays.toString(array));
    }
}

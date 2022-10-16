import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Первый уровень: 1. Реализуйте метод, который возвращает новый массив int.
        // Каждый элемент массива равен следующей степени двойки.
        // Длина массива задается n (максимальное значение n равно 30.
        // Как вы думаете, почему?)PowerOfTwo (5) -> {1,2,4,8,16}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(powerOfTwo(n)));
        System.out.println(Arrays.toString(powerOfTwo2(n)));
        System.out.println(Arrays.toString(powerOfTwo(n)));

    }

    private static int[] powerOfTwo(int length) {
        int[] powers = new int[length];
        for (int i = 0; i < length; i++) {
            powers[i] = (int) Math.pow(2, i);

        }
        return powers;
    }

    private static int[] powerOfTwo2(int length) {
        int[] powers = new int[length];
        powers[0] = 1;
        for (int i = 1; i < length; i++) {
            powers[i] = powers[i - 1] * 2;
        }
        return powers;
    }

    private static int recursive(int power, int[] array) {
        if (power == 0) {
            array[power] = 1;
        }
        return recursive(power - 1, array);


    }
}

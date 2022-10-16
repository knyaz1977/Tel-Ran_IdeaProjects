import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Реализуйте метод, который возвращает новый массив,
        // который является заданным массивом в обратном порядке
        // {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number equal to the number of cells in the array.");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] mas = new int[array.length];
        System.out.println("Input " + n + " numbers");
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        System.out.println(Arrays.toString(array));
        arrayContrary(array, mas);
    }

    private static void arrayContrary(int[] array, int[] mas) {
        for (int i = 0; i < array.length; i++) {
            int s = array.length - 1 - i;
            for (int j = s; j >= 0; j--) {
                mas[j] = array[i];
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        // Second level:
        // Task5
        // Попробуйте самостоятельно придумать и реализовать алгоритм сортировки одномерных массивов.
        // Допускается изучить известные методы и реализовать один из них.

        // Написать код функции, которая принимает в себя массив и определяет индекс
        // максимального элемента в массиве, а затем выводит данный элемент вместе с его индексом в консоль.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number equal to the number of cells in the array.");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Input " + n + " numbers");
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int id = 0;
        for (int i = 1; i < n; i++) {
            if (max > array[i]) {
                continue;
            } else {

                max = array[i];
                id = i;
            }
        }
        System.out.println(max + " " + id);

    }
}

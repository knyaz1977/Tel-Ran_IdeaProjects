import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
//        // Реализуйте метод, который создает заданный массив в обратном порядке.
//        // Это похоже на предыдущее, но вы должны решить его без нового массива
//        // {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number equal to the number of cells in the array.");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Input " + n + " numbers");
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        System.out.println(Arrays.toString(array));

        int p = (array.length - 1) / 2;
        arrayContrary2(array, p);
    }

    private static void arrayContrary2(int[] array, int p) {
        if ((array.length - 1) % 2 == 0) {
            for (int i = 0; i < p; i++) {
                for (int j = array.length - 1 - i; j > p; j--) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    break;
                }
            }
        } else {
            for (int i = 0; i <= p; i++) {
                for (int j = array.length - 1 - i; j >= p; j--) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
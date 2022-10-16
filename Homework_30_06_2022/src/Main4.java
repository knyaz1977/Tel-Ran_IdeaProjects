import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // Task4
        // Предположим, что существует два массива чисел, каждый из которых отсортирован в порядке возрастания.
        // Реализуйте метод int[] merge(int[], int[]), который объединяет эти массивы в один отсортированный массив.
        // ({1,4,6,8},{3,7}) ->{1,3,4,6,7,8}({12,19},{3,7}) ->{3,7,12,19}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number equal to the number of cells in the array 1.");
        int n = scanner.nextInt();
        int[] mas1 = new int[n];
        System.out.println("Input " + n + " numbers");
        for (int i = 0; i < n; i++)
            mas1[i] = scanner.nextInt();
        System.out.println(Arrays.toString(mas1));

        System.out.println("Input a number equal to the number of cells in the array 2.");
        int n1 = scanner.nextInt();
        int[] mas2 = new int[n1];
        System.out.println("Input " + n1 + " numbers");
        for (int i = 0; i < n1; i++)
            mas2[i] = scanner.nextInt();
        System.out.println(Arrays.toString(mas2));

        int[] mas3 = new int[mas1.length + mas2.length];
        int s = 0;
        combinedArray(mas1, mas2, mas3, s);
        System.out.println("New array    " + Arrays.toString(mas3));

        sortedArray(mas3);
        System.out.println("Sorted array " + Arrays.toString(mas3));
    }

    private static void combinedArray(int[] mas1, int[] mas2, int[] mas3, int s) {
        for (int i = 0; i < mas1.length; i++) {
            mas3[i] = mas1[i];
            s = s + 1;
            if (s == mas1.length) {
                for (int j = 0; j < mas2.length; j++) {
                    mas3[mas1.length + j] = mas2[j];
                }
                break;
            }
        }
    }

    private static void sortedArray(int[] mas3) {
        for (int h = 0; h < mas3.length; h++) {
            for (int y = h + 1; y < mas3.length; y++) {
                if (mas3[h] > mas3[y]) {
                    int temp = mas3[h];
                    mas3[h] = mas3[y];
                    mas3[y] = temp;
                }
            }

        }
    }
}

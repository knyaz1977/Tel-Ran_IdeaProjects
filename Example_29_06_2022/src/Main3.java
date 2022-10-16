import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // Получить первый элемент массива
        int firstElement = array[0];
        // Найти сумму элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        System.out.println();

        int[] mas = {6, 5, 0, 4, 3, 1};
        System.out.println(Arrays.toString(mas));
        bubbleSort(mas);
        System.out.println(Arrays.toString(mas));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}

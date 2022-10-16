import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        // Task4
        // Предположим, что существует два массива чисел, каждый из которых отсортирован в порядке возрастания.
        // Реализуйте метод int[] merge(int[], int[]), который объединяет эти массивы в один отсортированный массив.
        // ({1,4,6,8},{3,7}) ->{1,3,4,6,7,8}({12,19},{3,7}) ->{3,7,12,19}
        System.out.println(Arrays.toString(merge2(new int[]{1, 4, 6, 8}, new int[]{3, 7})));
        System.out.println(Arrays.toString(merge(new int[]{1, 4, 6, 8}, new int[]{3, 7})));
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                array[k++] = array1[i++]; //array[k] = array1[i];
                //i = i + 1;
            } else {
                array[k++] = array2[j++]; ////array[k] = array1[j];
                //j = j + 1;
            }
            //k = k + 1;
        }
        while (i < array1.length) {
            array[k++] = array1[i++];
        }

        while (j < array2.length) {
            array[k++] = array1[j++];
        }

        return array;
    }

    private static int[] merge2(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[array1.length + i] = array2[i];
        }
        Arrays.sort(array);
        return array;


    }
}
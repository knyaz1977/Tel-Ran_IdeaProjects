import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] array = {10, 1, 2, -1, 0};
        SelectSort(array);
        System.out.println(Arrays.toString(array));

        String[] strings = new String[]{"ac", "abc", "abb"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }

    private static void SelectSort(int[] array) {
        // Проходы по массиву
        for (int j = 0; j < array.length; j++) {
            int imin = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[imin]) {
                    imin = i;
                }
            }
            int temp = array[j];
            array[j] = array[imin];
            array[imin] = temp;
        }
    }
}
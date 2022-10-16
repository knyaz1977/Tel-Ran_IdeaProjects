import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 8, 3, 7};
        System.out.println(search(3, array));
        System.out.println(search(9, array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(2, array));

    }

    private static int binarySearch(int element, int[] array) {
        int middle = array.length / 2;  // индекс, указывающий на середину
        int left = 0, right = array.length - 1; // индексы

        while (left < right && right - left > 1) {
            if (element < array[middle]) {
                right = middle;
            } else {
                left = middle;
            }
            middle = (left + right) / 2;
        }
        if (array[left] == element) {
            return left;
        }
        if (array[right] == element) {
            return right;
        }
        return -1;
    }


    private static int search(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

}

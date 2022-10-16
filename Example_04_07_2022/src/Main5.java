import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 8, 3, 7};
        System.out.println(search(3, array));
        System.out.println(search(9, array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(2, array));

    }

    private static int binarySearch(int element, int[] array) {// binarySearch сортирует массив
        int middle = array.length / 2;
        int left = 0, right = array.length - 1;

        while (left < right) {
            if (element < array[middle]) {
                right = middle;
            } else if (element > array[middle]) {
                left = middle;
            } else {
                return middle;
            }
            if (right - left == 1 && array[left] != element && array[right] != element) {
                return -1;
            } else if (array[left] == element) {
                return left;
            } else if (array[right] == element) {
                return right;
            }
            middle = (left + right) / 2;
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

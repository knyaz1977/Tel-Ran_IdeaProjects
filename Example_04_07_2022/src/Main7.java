import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 8, 3, 7};
        System.out.println(search(3, array));
        System.out.println(search(9, array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(2, array));

    }

    private static int binarySearch(int element, int[] array) {
        int middle;  // индекс, указывающий на середину
        int left = 0, right = array.length - 1; // индексы

        while (left <= right) {
            middle = (left + right) / 2;
            if (element < array[middle]) {
                right = middle - 1;
            } else if (element > array[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
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

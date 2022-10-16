import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int[] array = {39, 22, 2, 55, 6, 20};
        qsort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(sum(new int[]{2, 4, 6}, 0));
        partition(array, 0, 5);
        System.out.println("partition:");
        System.out.println(Arrays.toString(array));


        System.out.println("Теcтирование swap");
        swap(array, 0, 4);
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println(getMinElement(array,0 )); //

    }

    private static void qsort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(arr, begin, end);
            qsort(arr, begin, pivotIndex - 1);
            qsort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int pivotIndex = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, end);
        return pivotIndex;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    private static int sum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + sum(arr, index + 1);
    }

    static int getMinElement(int arr[], int index) {
        int min;
        int length = arr.length;


        if (length > index) {
            min = getMinElement(arr, index + 1);
            if (arr[index] < min)
                return arr[index];
            else
                return min;

        } else {
            return arr[index - 1];
        }
    }
}
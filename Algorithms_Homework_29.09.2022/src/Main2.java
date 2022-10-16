import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        // First level: Применить метод "Разделяй и властвуй" и разработать алгоритм
        // поиска наименьшего значения массива.

        int[] array = {12, 5, 8, 7, 42, 15, 3, 10};
        System.out.println(getMinElement(array,0 ));
    }

    // алгоритм поиска наименьшего значения массива.
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

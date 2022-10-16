import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array); // сортирует массив
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input item");
        int item = scanner.nextInt();
        System.out.println(binarySearch(array, item));


    }

    private static int binarySearch(int[] array, int item) {
        int low = 0;                    // нижняя граница
        int high = array.length - 1;    // верхняя граница
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {        // элемент найден
                return mid;
            }
            if (guess > item) {
                high = mid - 1;         // "Много"
            } else {
                low = mid + 1;          // "Мало"
            }
        }
        return -1;
    }
}
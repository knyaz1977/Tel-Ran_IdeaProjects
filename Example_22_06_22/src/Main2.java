import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Дан массив вещественных чисел из n элементов (n
        // вводится с клавиатуры). Найти наименьшее число.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int n1 = scanner.nextInt();
        task1(n1);
    }

    private static void task1(int n1) {
        double[] array = new double[n1];
        for (int i = 0; i < n1; i++) {
            array[i] = Math.random(); // Math.random() выводит случайные числа от 0
            System.out.println(array[n1]);
        }
//        Найдем минимальный элемент массива
        double min = array[0];
        for (int i = 1; i < n1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int[] mas = inputArray(10);
        System.out.println(Arrays.toString(mas));   // Вывод массива mas в виде строки
        Arrays.sort(mas);   // сортировка массива mas по возрастанию элементов
        System.out.println(Arrays.toString(mas));
        int[] mas2 = Arrays.copyOf(mas, 5); // копирование массива mas в новый массив mas2, имеющий длину 5
        System.out.println(Arrays.toString(mas2));
        // копирование части массива, начиная с индекса 2, заканчивая индексом 5 (не включая)
        int[] mas3 = Arrays.copyOfRange(mas, 2, 5);
        System.out.println(Arrays.toString(mas3));

    }

    // Написать метод, который создает массив, указанной длины и заполняет его
    // элементами с клавиатуры
    private static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}

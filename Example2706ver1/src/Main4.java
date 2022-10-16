import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        // Демонстрация передачи параметров в метод по ссылке
        // Массивы всегда передаются по ссылке
        int[] array = {1, 2, 3};
        System.out.println("In main before " + Arrays.toString(array));
        changeArray(array);
        System.out.println("In main after " + Arrays.toString(array));

        System.out.println();

        int[] array2 = {4, 5, 6};
        System.out.println("In main before " + Arrays.toString(array2));
        changeArray(array2);
        System.out.println("In main after " + Arrays.toString(array2));
    }

    public static void changeArray(int[] mas) {
        System.out.println("In changeArray before " + Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i] * mas[i];
        }
        System.out.println("In changeArray after " + Arrays.toString(mas));
    }

}

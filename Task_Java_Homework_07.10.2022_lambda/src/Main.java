import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // First level: Разработать программу, в которой осуществляется поэлементное
        // суммирование массивов из 10 чисел. Тип чисел может быть любым числовым (int, double, float, …).
        // Суммирование массивов реализовать с помощью лямбда-выражения.
        // Поэлементно сложить два массива - это так: {1, 2, 3} + {4, 5, 6} = {5, 7, 9}

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Operationable operation = (x, y) -> x + y;
        int[] arrayFinal = new int[10];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            arrayFinal[i] = operation.sum(array1[i], array2[j]);
            j++;
        }
        System.out.println(Arrays.toString(arrayFinal));
        // Finale

    }

    @FunctionalInterface
    interface Operationable {
        int sum(int x, int y);
    }


}



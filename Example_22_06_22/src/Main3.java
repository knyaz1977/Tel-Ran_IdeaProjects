public class Main3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 7, 34, 6};
        printArray(array);
        int mas = 0;
        // Найти сумму четных элементов массива
        // a) Значения элементов - четные
        int s1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                s1 = s1 + array[i];
            }
        }
        System.out.println(s1);
        int s2 = 0;
        for (int i = 0; i < array.length; i++) { // заменя i += 2
            if (i % 2 == 0) {                    // <-- тогда эта страка не нужна!
                s2 = s2 + array[i];
            }
        }
        System.out.println(s2);

    }
    private static void printArray(int[] mas) {
        for (int i =0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }
        System.out.println();
    }
}
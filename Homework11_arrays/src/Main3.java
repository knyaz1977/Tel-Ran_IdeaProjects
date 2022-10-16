public class Main3 {

    public static void main(String[] args) {
        // Task3
        // Реализуйте метод, который возвращает сумму элементов заданного массива int{10, 3, 23, 5, -9} -> 32

        int[] array = {10, 3, 23, 5, -9};
        sum(array, 0);
    }

    private static void sum(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of elements of the given array is " + sum);
    }
}

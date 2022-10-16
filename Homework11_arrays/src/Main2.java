public class Main2 {

    public static void main(String[] args) {
        // Task2
        // Тема "Массивы":
        //
        //Реализуйте метод, который возвращает индекс самого большого элемента заданного массива int{10, 33, 3, 5, -9} -> 1
        int[] array = {10, 33, 3, 5, -9};
        max(array, 0, 0);
    }

    private static void max(int[] array, int max, int id) {
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                id = i;
            }
        }
        System.out.println("The biggest element is " + max);
        System.out.println("The index of the biggest element of a given array is " + id);
    }
}

public class Main {

    public static void main(String[] args) {
        // Написать метод, который проверяет массив на наличие дублейю
        int[] array = {1, 2, 3, 4, 5, 5};
        System.out.println(isRepeat(array));
    }

    private static boolean isRepeat(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (a == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}



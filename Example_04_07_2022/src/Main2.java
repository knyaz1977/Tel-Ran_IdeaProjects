public class Main2 {

    public static void main(String[] args) {

    }

    private static void SelectSort(int[] array) {
        int imin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[imin]) {
                imin = i;
            }
        }

    }
}

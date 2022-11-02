public class Main {
// First level: Написать алгоритм нахождения 4 -го и 3 - его
// по минимальности элемента в массиве
    public static void main(String[] args) {
//        int[] array = {3, 2, 41};
//        int[] array = {3, 2, 4, 1, 5, 1};
        int[] array = {98, 7, 65, 1, 23, 42, 5, 6, 7, 89, 41, 51, 1, 12, 33, 5, 48};
        getMin(array);
        //        Arrays.stream(array).min();
//        System.out.println(Arrays.toString(array));
    }

    public static void getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int min4 = Integer.MAX_VALUE;

        for (int j : array) {
            if (j < min) {
                min4 = min3;
                min3 = min2;
                min2 = min;
                min = j;
            } else if (j < min2 && j != min) {
                min4 = min3;
                min3 = min2;
                min2 = j;
            } else if (j < min3 && j != min2 && j != min) {
                min4 = min3;
                min3 = j;
            } else if (j < min4 && j != min3 && j != min2 && j != min) {
                min4 = j;
            }
        }

        if (min4 != Integer.MAX_VALUE) {
            System.out.println("Min 4: " + min4);
        } else {
            System.out.println("Min 4 doesn't exist");
        }
        if (min3 != Integer.MAX_VALUE) {
            System.out.println("Min 3: " + min3);
        } else {
            System.out.println("Min 3 doesn't exist");
        }
        if (min2 != Integer.MAX_VALUE) {
//            System.out.println("Min 2: " + min2);
        } else {
            System.out.println("Min 2 doesn't exist");
        }
//        System.out.println("Min : " + min);
    }
}

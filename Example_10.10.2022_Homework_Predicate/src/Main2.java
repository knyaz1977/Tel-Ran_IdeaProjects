import java.util.Arrays;
import java.util.Comparator;

public class Main2 {

    public static void main(String[] args) {
        /// Second level: Учитывая массив интервалов, где интервалы [i] = [li, ri]
        // представляют интервал [li, ri), удалите все интервалы,
        // которые покрыты другим интервалом в списке.
        // Интервал [a, b) покрывается интервалом [c, d) тогда и только тогда, когда c <= a и b <= d.
        // Верните значения оставшихся интервалов.

        int[][] intervals = {{1, 4}, {3, 6}, {2, 8}};
        System.out.println(Arrays.toString(intervals));
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        // лямбда заменяет компаратор ниже!
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] != o2[0] ? o1[0] - o2[0] : o2[1] - o1[1];
//            }
//        });
        int maxEnd = intervals[0][1]; // 4
        int answer = intervals.length; // 3
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] > maxEnd) {
                answer--;
            } else {
                maxEnd = intervals[i][1];
            }
            System.out.println(answer);

            //        Comparator
        }
    }
}
// import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.function.Predicate;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Написать программу, которая проверяет, что строка начинается буквой
//        // "J" или "N" и заканчивается "A".
//        // Используем функциональный интерфейс Predicate.
//        Predicate<String> predicate = s -> {
//            String s2 = s.toUpperCase();
//            return (s2.startsWith("J")
//                    || s2.startsWith("N"))
//                    && s2.endsWith("A");
//        };
//
//        System.out.println(predicate.test("Java"));
//        System.out.println(predicate.test("Nava"));
//        System.out.println(predicate.test("Qava"));
//        System.out.println(predicate.test("Qavb"));
//        System.out.println(predicate.test("Javb"));
//
//        // Level2
//        int[][] intervals = {{1,4},
//                {2,3}};
//        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
//
//        int maxEnd = intervals[0][1];   // 4
//        int answer = intervals.length;  // 3
//        for (int i = 1; i < intervals.length; i++) {
//            if (intervals[i][1] <= maxEnd) {
//                answer--;
//            } else {
//                maxEnd = intervals[i][1];
//            }
//        }
//        System.out.println(answer);
//
//        int t = interval(new int[]{1, 2}, new int[]{3, 4});
//
//        ArrayList<int[]> arrayList = new ArrayList<>();
//
//
//    }
//
//    private static int varPar(int... temp) {
//        // temp
//        return 0;
//    }
//
//    private static int interval(int[]... arr) {
//        Arrays.sort(arr, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
//
//        return 0;
//    }
//
//}

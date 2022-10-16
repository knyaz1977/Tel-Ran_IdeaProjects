import java.util.*;

public class Main2 {
    // Second level: Учитывая массив интервалов, где интервалы [i] = [li, ri]
    // представляют интервал [li, ri), удалите все интервалы,
    // которые покрыты другим интервалом в списке.
    // Интервал [a, b) покрывается интервалом [c, d) тогда и только тогда, когда c <= a и b <= d.
    // Верните значения оставшихся интервалов.
    public static void main(String[] args) {

        Integer[][] array = {{1, 4}, {3, 6}, {2, 8}};
//        Integer[][] array = {{1, 4}, {2, 3}};

//        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                int a = array[i][j];
                int b = array[i][j + 1];
                int c = array[i + 1][j];
                int d = array[i + 1][j + 1];

                if (c <= a && b <= d) {
                    array[i][j] = null;
                    array[i][j + 1] = null;
                } else if (a <= c && d <= b) {
                    array[i + 1][j] = null;
                    array[i + 1][j + 1] = null;
                }
            }
        }
        // К СОЖАЛЕНИЮ, НЕ НАШЕЛ, КАК ПРЕОБРАЗОВАТЬ ДВУМЕРНЫЙ МАССИВ В ArrayList, ЧТОБЫ ВЫВОД БЫЛ КРАСИВЕЕ :(

        for (int i = 0; i < array.length; i++) {
            int counter = array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) {
                    System.out.print(array[i][j] + " ");
//                } else {
//                    counter --;
//                }
                    System.out.println(counter); // ПОДУМАТЬ!!
                }
                System.out.println();
            }
        }
        // Преобразование к двумерному ArrayList
        ArrayList<int[]> arrayList = new ArrayList<>();
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // First level: Применить метод "Разделяй и властвуй" и разработать алгоритм
        // поиска наименьшего значения массива.
//      List<Integer> array = new ArrayList<>(Arrays.asList(12, 5, 8, 7, 42, 15, 3, 10));
        List<Integer> array = new ArrayList<>(Arrays.asList(12, 5, 8, 7, 42, 15, 3, 10, 2));
        System.out.println(array);
        List<Integer> array2 = new ArrayList<>();

        int mind;
        int j = 1;
        int k = 0;
        int m = 0;
        if (array.size() % 2 != 0) {
            m = array.get(array.size() - 1);
            array.remove(array.size() - 1);
        } else {
            m = array.get(0);
        }
        for (int i = 0; i < array.size() - 1; ) {
            if (array.get(i) > array.get(j)) {
                mind = array.get(j);
                array2.add(mind);
                j = j + 2;
                i = i + 2;
                k++;
            } else {
                mind = array.get(i);
                array2.add(mind);
                i = i + 2;
                j = j + 2;
                k++;
            }

            if (i >= array.size()) { // && array2.size() > 2
                array.clear();
                array.addAll(array2.subList(0, k));
                array2.clear();

                i = 0;
                j = 1;
                k = 0;
            }
            if (array.size() == 1) {
                if (m <= mind) {
                    System.out.println("Hаименьшее значение маccива = " + m);
                } else {
                    System.out.println("Hаименьшее значение маccива  = " + mind);
                }
            }
        }
    }
}

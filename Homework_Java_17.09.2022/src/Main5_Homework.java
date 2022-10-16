import java.util.HashMap;
import java.util.Map;

public class Main5_Homework {

    public static void main(String[] args) {

        int[] array1 = {9,4,9,8,4}; // {4,9,5} {1, 2, 2, 1}
        int[] array2 = {4,9,5};     // {9,4,9,8,4} {2, 2}

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            if (map.containsKey(array1[i])) { // если map содержит ключ  array1[i] = 1
                map.put(array1[i], map.get(array1[i]) + 1);
            } else {
                map.put(array1[i], 1);
            }
            // ниже короткая запись, того что вверху
//            map.put(array1[i], map.getOrDefault(array1[i], 0) + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            if (map.containsKey(array2[i]) && map.get(array2[i]) > 0) {
                System.out.print(array2[i] + " ");
                map.put(array2[i], map.get(array2[i]) - 1);
            }
        }
    }
}


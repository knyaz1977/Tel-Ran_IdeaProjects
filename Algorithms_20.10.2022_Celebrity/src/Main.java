import java.util.*;

public class Main {
    public static void main(String[] args) {
// calculate
        int[] a = {32, 12, 46, 15, 3};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        System.out.println(list);
        Arrays.sort(a); // сортировка
        System.out.println(Arrays.toString(a));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(99, "UY");
        System.out.println(map);
    }


}


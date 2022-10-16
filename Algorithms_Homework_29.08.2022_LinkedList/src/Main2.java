import java.util.LinkedList;
import java.util.List;

public class Main2 {
    // Second level: Даны два односвязных списка, в которых хранятся целые числа
    // в возрастающем порядке.
    // Получить объединение этих двух списков (третий список),
    // в котором элементы будет также отсортированы в возрастающем порядке.
    //Пример, 1 -> 3 -> 5 -> 7 (первый список), 0 -> 3 -> 4 (второй список),
    // 0 -> 1 -> 3 -> 3 -> 4 -> 5 -> 7 (результирующий список).

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(0);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else {
                list3.add(list2.get(j));
                j++;
            }
        }
        if (i < list1.size()) {
            while (i < list1.size()) {
                list3.add(list1.get(i));
                i++;
            }
        }
        if (j < list2.size()) {
            while (j < list2.size()) {
                list3.add(list2.get(j));
                j++;
            }
        }
        System.out.println(list3);
    }
}



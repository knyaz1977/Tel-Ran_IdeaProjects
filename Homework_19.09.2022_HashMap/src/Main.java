import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Первый уровень: Учитывая строку s, найдите в ней первый неповторяющийся символ и верните его индекс. Если он не существует, верните значение -1.
        //Пример 1:
        //Ввод: s = "leetcode"
        //Выход: 0
        //Пример 2:
        //Ввод: s = "loveleetcode"
        //Выход: 2
        //Пример 3:
        //Ввод: s = "aabb"
        //Выход: -1
        //Подсказка: Это можно решить с помощью HashMap.

        String s = "aabb";

        char[] array1 = s.toCharArray();
        HashMap<Character, Integer> myHashMap = new LinkedHashMap<>();
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Element [" + i + "]: " + array1[i]);
            if (myHashMap.containsKey(array1[i])) { // если myHashMap содержит ключ  array1[i]
                myHashMap.put(array1[i], myHashMap.get(array1[i]) + 1);
            } else {
                myHashMap.put(array1[i], 1);
            }
        }
        System.out.println();
        System.out.println("Вывод Map:");
        for (Map.Entry<Character, Integer> entry : myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            if (myHashMap.get(array1[i]) == 1) {
                System.out.println("первый уникальный cимвол " + array1[i] + " имеет индекc " + i);
                break;
            } else if (i + 1 == array1.length) {
                System.out.println("уникальный cимвол не cущеcтвует, -1");
            }
        }
    }
}



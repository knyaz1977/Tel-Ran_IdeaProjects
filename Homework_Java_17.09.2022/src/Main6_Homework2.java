import java.util.HashMap;
import java.util.Map;

public class Main6_Homework2 {

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

        String s = "leetcode";

        char[] array1 = s.toCharArray();
        HashMap<Integer, Character> myHashMap = new HashMap<Integer, Character>();
        for (int i = 0; i < array1.length; i++) {
//            System.out.println("Element [" + i + "]: " + array1[i]);
            myHashMap.put(i, array1[i]);
        }
        for (Map.Entry<Integer, Character> entry : myHashMap.entrySet())

            System.out.println(entry.getKey() + " - " + entry.getValue());
    }

}





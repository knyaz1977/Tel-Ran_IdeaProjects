import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doors {
    // ДЗ найти количество открытых дверей после 100 прохода по всем 100 дверям
// первый проход:открываем все двери делящиеся на 1
// второй проход: закрываем все двери делящиеся на 2,
// третий проход: открываем все двери делящиеся на 3,
// четвертый проход: закрываем все двери делящиеся на 4,
// ...
// сотый проход: закрываем все двери делящиеся на 100.
    public static void main(String[] args) {
        List<Integer> arrayDoor = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayDoor.add(i + 1);
        }
        System.out.println(arrayDoor);

        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 1; i <= arrayDoor.size(); i++) {
            for (; j < arrayDoor.size(); j = j + i) {
                int c = arrayDoor.get(j);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            j = 0;
            j = j + i;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.println("Door number " + entry.getKey() + " was opened/closed  " + entry.getValue() + " times. " + " The door is closed");     // выводим ключ/и(key) с максимальным значением!
            } else {
                System.out.println("Door number " + entry.getKey() + " was opened/closed  " + entry.getValue() + " times. " + " The door is open");
            }
        }
    }
}

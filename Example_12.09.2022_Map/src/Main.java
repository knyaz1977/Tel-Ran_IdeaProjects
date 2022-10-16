import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> passportAndNames = new HashMap<>();
        passportAndNames.put(1234, "Anton Loshmanov");
        passportAndNames.put(56, "qwerty"); // 56 - это ключ
        System.out.println(passportAndNames.get(56));
        passportAndNames.put(56, "asdfghjkl");
        System.out.println(passportAndNames.get(56));

        // Ключ в Map уникален!!!

        HashMap<Soldier, Integer> soldierIntegerHashMap = new HashMap<>();
        soldierIntegerHashMap.put(new Soldier(), 12345);

        soldierIntegerHashMap.clear(); // Очистка Map

        // Проверка наличия ключа или значения
        System.out.println(passportAndNames.containsKey(1234));
        System.out.println(passportAndNames.containsKey(12));
        System.out.println(passportAndNames.containsValue("Anton Loshmanov"));
        System.out.println(passportAndNames.containsValue("qwerty"));

        System.out.println(passportAndNames.isEmpty()); // Проверка, пуста ли Map

        passportAndNames.remove(56); // Удаление по ключу

        System.out.println(passportAndNames.size()); // Количество элементов коллекции

//        passportAndNames.keySet(); // Возвращает набор всех ключей Map

//        passportAndNames.values(); // Возвращает коллекцию всех значений Map

        for (Map.Entry<Integer, String> item : passportAndNames.entrySet()) { // entrySet - Содержимое
            System.out.println(item.getKey() + " - " + item.getValue());
        }

        soldierIntegerHashMap.put(new Soldier(), 23);
        for (Map.Entry<Soldier, Integer> item : soldierIntegerHashMap.entrySet()) { // entrySet - Содержимое
            Soldier key = item.getKey();
            Integer value = item.getValue();
            System.out.println(key + " - " + value);
        }
        System.out.println();
        TreeMap<Integer, String> states = new TreeMap<>(); // TreeMap - Сортировка по возрастанию ключа
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");
        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.println(item.getValue());
        }

        System.out.println();

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(); // LinkedHashMap - Сортировка по убыванию ключа
        linkedHashMap.put(10, "Germany");
        linkedHashMap.put(2, "Spain");
        linkedHashMap.put(14, "France");
        linkedHashMap.put(3, "Italy");
        for (Map.Entry<Integer, String> item : linkedHashMap.entrySet()) {
            System.out.println(item.getValue());
        }
    }
}

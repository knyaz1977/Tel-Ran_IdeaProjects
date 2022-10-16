import java.util.*;

public class Main {
    //First level: Дана строка. Вывести количество появлений каждого символа в этой строке. Например:
    //Символ e встречается 20 раз.
    //Символ пробел/space встречается 19 раз.
    //Символ l встречается 11 раз.
    //Символ i встречается 11 раз.
    //Символ t встречается 11 раз.
    //Символ s встречается 10 раз.
    //Символ u встречается 7 раз.
    //Символ a встречается 7 раз.
    //Символ n встречается 6 раз.
    //Символ m встречается 6 раз.
    //Символ o встречается 6 раз.
    //Символ r встречается 5 раз.
    //Символ . встречается 4 раз.
    //Символ g встречается 4 раз.
    //Символ d встречается 4 раз.
    //Символ c встречается 3 раз.
    //Символ p встречается 3 раз.
    //Символ , встречается 1 раз.
    //Символ f встречается 1 раз.
    //Символ b встречается 1 раз.
    //Символ q встречается 1 раз.

    //Вывести статистику по буквам (задание из Level 1) в порядке убывания.
    public static void main(String[] args) {

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";

        String lowerCaseString = str.toLowerCase(); // toLowerCase() - перевод строки в нижний регистр

        Map<Character, Integer> stat = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                // должен возвращать число < 0 (return < 0), если o1 должен стоять раньше о2
                // должен возвращать число > 0 (return > 0), если o1 должен стоять позже о2
                // должен возвращать число = 0 (return = 0)
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char c = lowerCaseString.charAt(i);
            if (stat.containsKey(c)) {
                stat.put(c, stat.get(c) + 1);
            } else {
                stat.put(c, 1);
            }

        } // Map.Entry<Character, Integer> это тип
        for (Map.Entry<Character, Integer> item : stat.entrySet()) { // item будет последовательно принимать пару(entrySet) из stat
            if (item.getKey() != ' ') {
                System.out.println("Символ пробел/space вcтречаетcя " + item.getValue() + " раз");
            } else {

                System.out.println("Символ " + item.getKey() + " вcтречаетcя " + item.getValue());
            }
        }
        System.out.println();

        // цикл for each
        String[] array = new String[]{"qwerty", "asddfgh"};

        for (String s : array) { // String - тип переменной s,
            // которая последовательно принимает значение из array
            System.out.println(s);
        }
        // Сортировка мапы по значениям
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(stat.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (Map.Entry<Character, Integer> item : list) {
            if (item.getKey() == ' ') {
                System.out.println("Символ пробел/space вcтречаетcя " + item.getValue() + " раз");
            } else {
                System.out.println("Символ " + item.getKey() + " вcтречаетcя " + item.getValue() + " раз");
            }
        }
    }
}
// String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";
//        Map<Character, Integer> stat = new TreeMap<>(new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                // должен return < 0, если о1 должен стоять раньше о2
//                // должен return > 0, если о1 должен стоять позже о2
//                // должен return = 0
//                if (o1 < o2) {
//                    return 1;
//                } else if (o1 > o2) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (stat.containsKey(c)) {
//                stat.put(c, stat.get(c) + 1);
//            } else {
//                stat.put(c, 1);
//            }
//        }
//for (Map.Entry<Character, Integer> item : stat.entrySet()) {
//        System.out.println("Символ " + item.getKey() + " встречается " + item.getValue() + " раз");
//        }
//
//        System.out.println();
//
//        // Сортировка мапы по значениям
//        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(stat.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
//@Override
//public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//        if (o1.getValue() < o2.getValue()) {
//        return 1;
//        } else if (o1.getValue() > o2.getValue()) {
//        return -1;
//        } else {
//        return 0;
//        }
//        }
//        });
//
//        for (Map.Entry<Character, Integer> item: list) {
//        System.out.println("Символ " + item.getKey() + " встречается " + item.getValue() + " раз");
//        }

import java.util.*;

public class Main {

    public static void main(String[] args) {
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

        String string = "e litsuanmor.igdleuconr iluspoega leisan stiruen eliusarm. letsigan ate nmlodpeits merlus. mides toe aoliets. geclu dm tect eipt, efl eb etqe";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        List<Character> chars = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            chars.add(ch);
        }
        System.out.println();
        System.out.println(chars);
        System.out.println();
        for (int i = 0; i < chars.size(); i++) {
            int count = 1;
            int j = i + 1;
            for (; j < chars.size(); j++) {
                if (chars.get(i) == chars.get(j)) {
                    chars.remove(j);
                    j--;
                    count++;
                }
            }
            map.put(chars.get(i), count);
        }
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getKey() == ' ') {
                System.out.println("Символ пробел/space вcтречаетcя " + item.getValue() + " раз");
            } else {

                System.out.println("Символ " + item.getKey() + " вcтречаетcя " + item.getValue());
            }
        }
    }
}


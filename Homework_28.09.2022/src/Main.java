//import java.util.function.Supplier;

import java.util.function.Predicate;

public class Main {

    // Учитывая строку s, найдите длину самой длинной подстроки
// без повторяющихся символов.
//Пример 1:
//Ввод: s = "abcabcbb"
//Выход: 3
//Пояснение: Ответ - "abc", длина которого равна 3.
//Пример 2:
//Ввод: s = "bbbbb"
//Выход: 1
//Пояснение: Ответ - "b", длина которого равна 1.
//Пример 3:
//Ввод: s = "pwwkew"
    public static void main(String[] args) {

        Predicate<String> notNull = x -> x != null;
        System.out.println(notNull.test(" "));
        notNull.and(x -> x != "");
        System.out.println(notNull.test(""));

//        String s = "abcabcbb";
//
//        //string to char array
//        ArrayList<Character> arrayList = new ArrayList<>();
//        ArrayList<Character> arrayList2 = new ArrayList<>();
//        char[] chars = s.toCharArray();
//        System.out.println(chars);
//        int j = 0;
//            for (int i = 1; i < chars.length; i++) {
//
//                arrayList.add(chars[j]);
//                if (chars[j] != chars[i]) {
//                    arrayList.add(chars[i]);
//                }else{
//                    arrayList2 = arrayList;
//                    j = j +i;
//                }
//            }

//        ArrayList<String> nameList = new ArrayList<>();
//        nameList.add("Elena");
//        nameList.add("Alexandr");

    }
}

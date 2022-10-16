import java.util.ArrayList;
import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        // //// Second level: Given two strings needle and haystack, return the
        ////        // index of the first occurrence of needle in haystack, or -1 if
        ////        // needle is not part of haystack.
        ////        //Example 1:
        ////        //Input: haystack = "sadbutsad", needle = "sad"
        ////        //Output: 0
        ////        //Explanation: "sad" occurs at index 0 and 6.
        ////        //The first occurrence is at index 0, so we return 0.
        ////        //Example 2:
        ////        //Input: haystack = "leetcode", needle = "leeto"
        ////        //Output: -1
        ////        //Explanation: "leeto" did not occur in "leetcode", so we return -1.
        ////        Optional<String> first = Stream.of("sadbutsad", "sad")
        ////                .filter(e -> e == "sad")
        ////                .findFirst();
        ////        if (first.isPresent()) {
        //////            System.out.println(first.);

        // Решение преподавателя по алгоритмам не мое!!!

        String text = "leetcode";
        String sample = "leeto";

        System.out.println(Arrays.toString(search(text, sample).toArray()));
        System.out.println(Arrays.toString(prefixFunction(sample)));
        System.out.println(Arrays.toString(KMPSearch(text, sample).toArray()));
    }

    //простой алгоритм
    //если ресурс будет "AAAAAAAAAAAAAAAAAAAAAAAAAAAAA" а шаблон "AAAAAAAAAAAAAAAС" то страдает производительность
    //все проверять впустую О(source*template)
    static ArrayList<Integer> search(String source, String template) {
        ArrayList<Integer> foundPositions = new ArrayList<>();
        //цикл по всем символам текста
        for (int i = 0; i < source.length(); i++) {
            //для указания позиции шаблона
            int templatePosition = 0;
            //пока мы не вышли за границы шаблона И не вышли за границы ресурса И символы в шаблоне и в ресурсе равны
            while (templatePosition < template.length()
                    && i + templatePosition < source.length()
                    && template.charAt(templatePosition) == source.charAt(i + templatePosition)) {

                templatePosition++;
            }
            //мы прошли по всем символам и все они совпали-значит нашли слово которое искали
            if (templatePosition == template.length()) {
                //просто его добавляем
                foundPositions.add(i);
            }
        }
        return foundPositions;
    }

    //находим префиксную функцию [0 1 0 1 2 3]
    static int[] prefixFunction(String template) {
        //создаем массив для функции
        int[] values = new int[template.length()];
        for (int i = 1; i < template.length(); i++) {
            int templatePosition = 0;
            //ищем себя внутри себя
            while (i + templatePosition < template.length() && template.charAt(templatePosition) == template.charAt(i + templatePosition)) {
                /*
                 * если символ в образце совпадает с символом из начала образца
                 * соответствующую позицию значения префиксной функции
                 * записываем максимальное значение из того что там и так уже было
                 * или записываем позицию совпавшего символа внутри образца
                 * */
                values[i + templatePosition] = Math.max(values[i + templatePosition], templatePosition + 1);
                templatePosition++;
            }
        }
        return values;
    }

    public static ArrayList<Integer> KMPSearch(String source, String template) {
        //массив для найденных вхождений
        ArrayList<Integer> found = new ArrayList<>();
        // вычисляем префиксную функцию
        int[] prefixFunc = prefixFunction(template);

        int sourcePosition = 0;
        int templatePosition = 0;
        //пока не дошли до конца текста
        while (sourcePosition < source.length()) {
            //если символ в образце совпадает с символом в тексте
            if (template.charAt(templatePosition) == source.charAt(sourcePosition)) {
                //просто двигаемся дальше
                templatePosition++;
                sourcePosition++;
            }
            //если все символы совпали
            if (templatePosition == template.length()) {
                //в найденные позиции записываем первый символ начала вхождения
                found.add(sourcePosition - templatePosition);
                //берем из префиксной функции значение куда нужно вернуться из последнего значения
                templatePosition = prefixFunc[templatePosition - 1];

                //если не нашли совпадения и символ образца не совпал с символом текста
            } else if (sourcePosition < source.length() && template.charAt(templatePosition) != source.charAt(sourcePosition)) {
                //если это не первый символ образца
                if (templatePosition != 0) {
                    //просто вернуть что находится на соответствующей позиции префиксной функции
                    //не нашли необходимый элемент то вернулись на нужную позицию
                    //вернулись назад в то место с которого можно продолжить поиск
                    templatePosition = prefixFunc[templatePosition - 1];
                } else {
                    //....или делаем шаг вперед, просто продвигаемся дальше по тексту
                    sourcePosition = sourcePosition + 1;
                }
            }
        }
        return found;
    }
}


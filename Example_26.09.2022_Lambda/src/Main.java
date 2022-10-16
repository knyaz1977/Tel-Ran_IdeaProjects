import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] array1 = {"hello", "java"};
        String[] array2 = {"qwerty"};
        String[] array3 = {"example", "string", "array"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator<String[]> sortByLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };
        Comparator<String[]> sortByWordsLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int length1 = 0;
                for (String s : o1) {
                    length1 = length1 + s.length();
                }
                int length2 = 0;
                for (String s : o2) {
                    length2 = length2 + s.length();
                }
                return length1 - length2;
            }
        };
        arrays.sort(sortByLength);
        System.out.println(arrays);

        // передаем метод compare хотя мы его и не видим.
        arrays.sort((o1, o2) -> o1.length - o2.length); // -> лямбда. Из чего и(->) что нужно сделать
        arrays.sort((arr1, arr2) -> arr1.length - arr2.length);

        List<Integer> list = new LinkedList<>();
        list.add(1);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(1);


        // короткая запись выше.
        arrays.sort(new Comparator<String[]>() { //анонимный класс
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });


//        List<Integer> list = new ArrayList<>();
//        list.sort((o1, o2) -> o1.length - o2.length);
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.length - o2.length;
//            }
//        });

        // q(параметр) -> тело метода

    }
}

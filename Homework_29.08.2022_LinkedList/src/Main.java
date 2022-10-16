import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //First level: Даны два LinkedList, содержащих целые числа. Числа в них расположены в возрастающем порядке.
        // Необходимо получить третий LinkedList, являющийся объединением первых двух, причем числа в нем тоже
        // должны быть расположены в возрастающем порядке. Например, из списков 1 - 2 - 4 и 1 - 3 - 4
        // должен получиться 1 - 1 - 2 - 3 - 4 - 4.
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        LinkedList<Integer> list3 = new LinkedList<Integer>();
        for (Integer i : list1) {
            int k = i - 1;
            if (list1.get(k) >= list2.get(k)) {
                list3.add(k, list2.get(k));
                list3.add(i, list1.get(k));
            } else {
                list3.add(k, list1.get(k));
                list3.add(i, list2.get(i));
            }
            System.out.println(list3);
        }
//        System.out.println(list3);
//        LinkedList<Integer> list3 = new LinkedList<Integer>();
//        list3.addAll(list1);
//        list3.addAll(list2);
//        System.out.println(list3);
//
//        LinkedList<Integer> list4 = new LinkedList<Integer>();
//        for (int i = 0; i < list3.size() - 1; i++) {
////            if (list3.get(i + 1) == null) {
////                break;
////            }
//            if (list3.get(i) >= list3.get(i + 1)) {
////                int temp = list3.get(i + 1);
//                list4.add(i, list3.get(i + 1));
//                list3.add(i + 1, list3.get(i));
////               System.out.println(list3.get(i) + " Больше " + list3.get(i + 1));
//
//            } else {
//                list4.add(list3.get(i));
////                list4.add(list3.get(i + 1));
////                System.out.println(list3.get(i) + " Меньше " + list3.get(i + 1));
//            }
//            System.out.println(list4);
//        }

    }

}

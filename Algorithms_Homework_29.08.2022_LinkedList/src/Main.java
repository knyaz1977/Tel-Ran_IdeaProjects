import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //First level: Дан односвязный список, в котором хранятся целые числа. Написать метод, который в качестве параметра
        // принимает число k. Метод должен найти в списке элемент со значением, равным k и удалить его из списка. Предполагаем,
        // что такой элемент есть в списке обязательно и он встречается там один раз.
        //Пример, 1 -> 2 -> 3 -> 4 -> 5 (исходный список). Вызываем метод remove(3).
        //1 -> 2 -> 4 -> 5 (результирующий список).
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        int k = 3;
        methodK(list1, k);
        System.out.println(list1.toString());

    }
    // ЭТОД МЕТОД ОТРАБОТАЕТ, ДАЖЕ ЕСЛИ ЧИСЛО k ВСТРЕТИТСЯ В СПИСКЕ НЕСКОЛЬКО РАЗ! :)
    private static void methodK(LinkedList<Integer> list1, int k) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == k) {
                list1.remove(i);
                i--;
            }
        }
    }

}

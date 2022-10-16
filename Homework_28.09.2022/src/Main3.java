import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 89, -1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        list.forEach(n -> System.out.print(n + " "));
        System.out.println();
        //n -> System.out.print(n);
        //Method reference
        list.forEach(System.out::print);
        System.out.println();
        list.forEach(Main3::print); // :: - Ссылка на метод
        System.out.println();
        List<User> users = new ArrayList<>();
        users.add(new User("John"));
        users.add(new User("Ann"));

        // ОДИНАКОВЫЕ
        users.forEach(User::print);
        users.forEach(user -> user.print());

        System.out.println();

        System.out.println(max());
        System.out.println(max(1));
        System.out.println(max(1, 2));
        System.out.println(max(1, 2, 3));
    }

    private static void print(int a) {
        // do something
        System.out.print(a + " ");
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static int max(int... a) {
        if (a.length == 0) {
            return -1;
        }
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
//    private static int max(int a, int b) {
//
//    }
//
//    private static int max(int a, int b, int c) {
//
//    }
//
//    private static int max(int a, int b, int c, int d) {
//
//    }
//
//    private static int max(int[] array) {
//
//    }

//    private static int max(int... a) {
//        int max = a[0];
//                for (int num : a) {
//                    if
//                }
//    }


}

import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        String[] array1 = {"qwerty ", "asd "};
        Integer[] array2 = {1, 2, 3, 4, 5};
        print(array1);
        print(array2);

        System.out.println();

        Double[] array3 = {0.4, 0.8};
        Integer[] array4 = {1,2};
        Test<Double> test1 = new Test<>(array3);
        System.out.println(test1.avg());
        Test<Integer> test2 = new Test<>(array4);
        System.out.println(test2.avg());
    }

    public static <T> void print(T[] items) {
        for (T item : items) {
            System.out.print(item + " ");
        }
    }
}

// public class Main {
//
//    public static void main(String[] args) {
//        Double[] array1 = {0.1, 0.2};
//        Integer[] array2 = {1, 2};
//        Test<Double> test1 = new Test<>(array1);
//        System.out.println(test1.avg());
//        Test<Integer> test2 = new Test<>(array2);
//        System.out.println(test2.avg());
//    }
//
//}






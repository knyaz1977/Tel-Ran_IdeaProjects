import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        test(10);
        System.out.println();
        test(10, 2, 3, 40);
        System.out.println();
        test();
//        System.out.println(Arrays.toString(args));
    }

    private static void test(int... v) {
        System.out.println("length = " + v.length);
        // v = 10, 2, 3, 40
        for (int p : v) {
            // p принимает последовательно = 10 затем 2, 3, 40
            System.out.println(p);
        }
    }


}

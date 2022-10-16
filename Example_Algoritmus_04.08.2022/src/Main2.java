public class Main2 {

    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return fact(n - 1) * n;

    }
}


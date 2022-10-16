public class Main2 {

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(factRec(3));
    }

    private static int fact(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
        }
        return p;
    }

    private static int factRec(int n) {
        if (n == 1) {
            return 1;
        }
        return factRec(n - 1) * n;
    }
}

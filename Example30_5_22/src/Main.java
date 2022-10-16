public class Main {

    public static void main(String[] args) {
        int a = 2, b = 2, c = 3;
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b); // a меньше либо равно b
        System.out.println(a >= b); // a меньше либо равно b
        System.out.println(a == b); // a равно ли b
        System.out.println(a != b); // a не равно ли b

        System.out.println();

        boolean f = a < b;
        System.out.println(f);
        System.out.println();
        // 1 < x < 10 (x больше 1 И меньше 10)
        System.out.println(a < b && b < c); // для истинности выражения необходимо, чтобы
        // истинными были выражения слева и справа от оператора &&

        System.out.println(a < b || b < c); // для истинности выражения необходимо, чтобы
        // истинным было хотя бы одно выражение слева и справа от оператора ||

        System.out.println(!(a < b)); // если выражение в скобках ложное, то результат будет истинным и наоборот

        System.out.println();
        System.out.println(isEven(4));
        System.out.println(isEven(5));
    }

    // Написать метод, который принимает на вход целое число и возвращает true, если
    // число четное
    private static boolean isEven(int a) {

       int rem = a % 2;  // нашли остаток от деления на 2
        boolean answer = rem == 0;
        return answer;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        meth1(a, b);
        System.out.println();
        System.out.println("min = " + min(a, b));

        if (isEven(a)) {
            System.out.println("a is even(четное)");
        } else {
            System.out.println("a is odd(не четное)");
        }
        // System.out.println(isEven(a));

        if (isWillHire(a, b)) {
            System.out.println("Will be hired");
        } else {
            System.out.println("Will not be hired");
        }
    }

    private static void meth1(int a, int b) {
        if (a < b) {
            System.out.println("a < b");
            System.out.println("true");
            System.out.println();
        } else {
            System.out.println("a >= b");
            System.out.println("false");
        }
    }

    // Метод находит минимальное число из двух чисел и возвращает этот минимум4

    private static int min(int a, int b) {
        Math.min(a, b);
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    //Метод получает число и проверяет его четность
    private static boolean isEven(int a) {
        // return // a % 2 == 0 // эта одна строчка может заменить весь наш метод if
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Приём на работу идёт на конкурсной основе. Условия приёма требуют 20 лет
    // рабочего стажа и возраста не более 42 лет. Определите, будет ли человек принят.
    private static boolean isWillHire(int a, int b) {
        // return experience >=20 && age <= 42; // весь наш код может быть заменен на одну эту строчку
        if (a >= 20 && b <= 42) {
            return true;
        } else {
            return false;
        }
    }


}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 	Дано натуральное число n. Вычислить:
        //а) 2^n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n!");
        int n = scanner.nextInt();
        int d = 2;
        for (int i = 1; i < n; i++) {
            d = d * 2;
        }
        System.out.println("2 to the power of n is " + d);

        //б) n!.
        //
        //В пункте б – это факториал числа n, т.е. произведение чисел от 1 до n.
        // Обращаю внимание, что это задачи на применение циклов.
        System.out.println();
        int f = 1;
        for (int i = 1; i < n + 1; i++) {
            f = f * i;
        }
        System.out.println("Factorial of the number n is " + f);

        // Даны натуральные числа n,a_1,…,a_n. Определить количество членов
        // последовательности a_1,…,a_n:
        // а) являющихся нечетными числами;
        System.out.println();
        int s = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                s = s + 1;
            }
        }
        System.out.println("The number of members of the sequence a_1,...,a_n that are odd numbers is " + s);
        // б) кратных 3 и не кратных 5;
        System.out.println();
        int s1 = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                s1 = s1 + 1;
            }
        }
        System.out.println("The number of members of the sequence a_1,...,a_n, multiples of 3 and not multiples of 5, is " + s1);
        // в) имеющих четные порядковые номера и являющихся нечетными числами.
        System.out.println();
        int counter = 0;
        int p = 0;
        for (int i = 1; i < n + 1; i++) {
            if (p % 2 == 0 && i % 2 != 0) {
                counter = counter + 1;

            }
            p++;
        }
        System.out.println("The number of members of the sequence a_1,...,a_n having even ordinal numbers and being odd numbers., is " + counter);

    }
}

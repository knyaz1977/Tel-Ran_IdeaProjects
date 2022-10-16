public class Main {

    public static void main(String[] args) {
        // Необходимо вывести на экран числа от 1 до 5
        // На экран должно быть: 1 2 3 4 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        // Необходимо вывести на экран числа от 5 до 1
        // На экран должно быть: 5 4 3 2 1
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // «Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем,
        // программа должна выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz. Если число кратно
        // пятнадцати, то программа должна выводить слово FizzBuzz. Задача может показаться очевидной, но нужно
        // получить наиболее простое и красивое решение.»
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
        // Необходимо вывести на экран таблицу умножения на 3
        for (int i = 0; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }
        // Необходимо, чтоб программа выводила на экран вот такую
        // последовательность:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println();
        for (int i = 1; i < 15; i++) {
            System.out.print(i * 7 + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0)
            System.out.print(i + " ");

        }
    }
}

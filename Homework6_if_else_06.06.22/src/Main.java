import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task1
        // Первый уровень: Представьте, что вы пишете программу для кино. Метод, который вы должны создать,
        // принимает два аргумента. Первый - это возраст человека; второй - возрастное ограничение фильма.
        // Метод должен печатать, разрешен ли этот фильм для человека или нет
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Input the age of the person");
            int ap = scanner.nextInt();
            System.out.println("Input the age limit of the film");
            int al = scanner.nextInt();
            isAge(ap, al);
            // Второй уровень: Реализуйте программу, которая просит пользователя ввести три целых числа
            // (используйте сканер) и вывести максимум из трех чисел. 19,10,1 ->19
            System.out.println();
            System.out.println("Input three integers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            isNumber(a, b, c);
        }
    }

    private static void isAge(int ap, int al) {
        if (ap >= al) {
            System.out.println("This movie is allowed for a person");
        } else {
            System.out.println("This movie is not allowed for a person");
        }
    }

    private static void isNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("The maximum number of three is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The maximum number of three is " + b);
        } else {
            System.out.println("The maximum number of three is " + c);
        }
    }
}
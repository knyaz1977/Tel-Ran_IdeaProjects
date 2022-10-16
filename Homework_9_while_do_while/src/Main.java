import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task1
        // Первый уровень: 1. Реализуйте метод “обратного отсчета”, который выводит числа от 5 до 1,
        // чем выводит „старт“. Реализуйте его, используя оба типа обратного
        //отсчета цикла() -> 5
        //
        //4
        //3
        //2
        //1
        //Начать
        int i = 4;

        whiLe(i);
        System.out.println();
        doWhile(i);
    }

    private static void doWhile(int i) {
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
        System.out.println("Start");
    }

    private static void whiLe(int i) {
        while (i > 0) {
            System.out.println(i); // короткая запись System.out.println(i--); (--i)-означает
            i--;
        }
        System.out.println("Start");
    }
}

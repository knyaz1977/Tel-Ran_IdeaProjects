import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        // Task3
        // Реализуйте программу, которая считывает целые числа со сканера и печатает сумму всех
        // введенных целых чисел. Программа завершится при вводе 0.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x;
        do {
            x = scanner.nextInt();
            sum = sum + x;
        } while (x != 0);
        System.out.println(sum);
    }
}
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        // Task3
        // Реализуйте программу, которая считывает целые числа со сканера и печатает сумму всех
        // введенных целых чисел. Программа завершится при вводе 0.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Антон! Это задание пока работает не корректно, я над ним сегодня еще поработаю и Вам вышлю. Время до конца дня у меня еще есть! :)");
        System.out.println("Input an integer");

//
//        for ( int i = scanner.nextInt(); scanner.nextInt() != 0; i = i + scanner.nextInt()) {
        int i = scanner.nextInt();
        while (scanner.nextInt() != 0) {
            System.out.println("The sum of all entered integers is " + i);
            System.out.println();
            System.out.println("Input an integer");

            i = i + scanner.nextInt();
        }
    }
}

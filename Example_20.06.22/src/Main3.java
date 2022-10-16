import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        // Task3
        // Реализуйте программу, которая считывает целые числа со сканера и печатает сумму всех
        // введенных целых чисел. Программа завершится при вводе 0.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two integers year1 and year2");
        int year1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        System.out.println();
        System.out.println("The quantity of leap years between year1 and year2 is " + isLeap(year1, year2));
    }

    private static int isLeap(int year1, int year2) {
        if (year1 > year2) {
            int temp = year1;
            year1 = year2;
            year2 = temp;
        }
        int count = 0;
        for (int year = year1; year <= year2; year++) {
            if (isLeap(year)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}

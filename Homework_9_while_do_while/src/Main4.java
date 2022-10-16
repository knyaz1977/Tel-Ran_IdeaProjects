import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // Task4
        // Даны два целых числа year1 и year2. Реализовать метод, который возвращает количество
        // високосных лет между годом 1 и годом 2. Пример: получить Количество Високосных Лет (2000,2022) -> 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two integers year1 and year2");
        int year1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        System.out.println();
        System.out.println("The quantity of leap years between year1 and year2 is " + isDividedIntoFour(year1, year2));

    }

    private static int isDividedIntoFour(int year1, int year2) {
        int sum = 0;
        if (year1 > year2) {
            int temp = year1;
            year1 = year2;
            year2 = temp;
        }
        while (year1 <= year2) {
            if (year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0)) {
                sum = sum + 1; // sum++
            }
            year1++;
        }
        return sum;
    }
}


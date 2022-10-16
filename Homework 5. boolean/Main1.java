import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        // Task1
        // Первый уровень: 1. Создайте две переменные isWeekend и isRain.
        // Создайте переменную canWalk, значение которой должно быть true,
        // если сегодня выходной день (isWeekend=true) и дождя нет (isRain=false).
        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);
        if (canWalk == true) {
            System.out.println("We're going for a walk.");
        } else {
            System.out.println("We're not going for a walk.");
        }
        // Task2
        // Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
        // открыты магазины или нет. Реализует метод boolean canBuy, который возвращает true
        // Значение этой переменной должно быть true, если открыт хотя бы один магазин, в
        // противном случае false. Отобразите строку “Я могу купить еду, это ......“ и значение.
        System.out.println();
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println(canBuy);
        if (canBuy == true) {
            System.out.println("I can buy the food. It’s " + canBuy);
        } else {
            System.out.println("I can't buy the food. It’s " + !canBuy);
        }
        // Tack3
        // Давайте представим, что у нас есть устройство, в котором есть две колбы.
        // Устройство работает правильно, если температура первой колбы выше 100 градусов,
        // а температура второй колбы меньше 100 градусов. Вы должны написать метод, который
        // проверяет это устройство. Ваша программа должна иметь переменные temperature1 и temperature2.
        // В результате он выводит сообщение true или false.
        System.out.println();
        System.out.println("Input temperature1 ");
        double temperature1 = scanner.nextInt();
        System.out.println("Input temperature2 ");
        double temperature2 = scanner.nextInt();
        boolean canWorks = temperature1 > 100 && temperature2 < 100;
        System.out.println(canWorks);
        System.out.println();

        // Tack4
        // Второй уровень: Напишите метод, который принимает номер года в качестве параметра и
        // возвращает значение true, если год является високосным, и значение false, если год не является високосным.
        System.out.println("Input year!");
        int y = scanner.nextInt();
        if (isDividedIntoFour(y)) {
            System.out.println("result = " + isDividedIntoFour(y));
            System.out.println("The year is a leap year ");
        } else {
            System.out.println("result = " + isDividedIntoFour(y));
            System.out.println("The year is not a leap year ");
        }
    }

    private static boolean isDividedIntoFour(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
        //if (y % 4 == 0) {
        //    return true;
        //} else {
        //   return false;
    }
}

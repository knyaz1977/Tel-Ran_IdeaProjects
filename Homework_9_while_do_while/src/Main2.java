import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Task2
        // Даны два целых числа number1 и number2. Реализовать метод, который возвращает сумму всех чисел от number1
        // до number2, кратных 3.Пример: getSumDivisibleByTreeNumbers(20,10) -> 45
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two integers number1 and number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("The sum of all numbers between number1 and number2 that divisible by 3 is " + getSumDivisibleByTreeNumbersted(number1, number2));
    }

    private static int getSumDivisibleByTreeNumbersted(int number1, int number2) {
        int sum = 0;
        if (number1 >= number2) {
            int temp = number1; // временно сохранили в переменную temp переменную number1, чтобы не потерять значение!
            number1 = number2;
            number2 = temp;
        }
        while (number1 <= number2) {
            if (number1 % 3 == 0) {
                sum = sum + number1;
            }
            number1++;
        }
        return sum;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int number1 = scanner.nextInt();
        System.out.println("Input second number");
        int number2 = scanner.nextInt();
        System.out.println("number1=" + number1 + "  " + "number2=" + number2);
        int sum = number1 + number2;
        int sub = number1 - number2;
        System.out.println(number1 + "+" + number2 + "=" + sum);
        System.out.println(number1 + "-" + number2 + "=" + sub);
        // Task2


    }
}

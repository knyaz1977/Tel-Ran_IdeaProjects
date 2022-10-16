import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        // Task5
        // Second level:
        // Реализовать метод, который проверяет, является ли данное число простым
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number n");
        int n = scanner.nextInt();

        if (prime(n)) {
            System.out.println("result = " + prime(n));
            System.out.println("The given number is prime ");
        } else {
            System.out.println("result = " + prime(n));
            System.out.println("The given number is not prime ");
        }
    }

    private static boolean prime(int n) {
        int i = 2;
        boolean result;

        do {
            if (n % i != 0 || n == 1 || n == 2) {
                result = true;
            } else {
                return false;
            }
            i++;
        } while (i < n);
        return result;
    }
}

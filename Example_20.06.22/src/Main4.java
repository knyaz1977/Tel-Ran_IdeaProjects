import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // Task5
        // Second level:
        // Реализовать метод, который проверяет, является ли данное число простым
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number n");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
    private  static boolean isPrime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i ==0) {
                return false;
            }
            i++;
        }
       return false;

    }
}

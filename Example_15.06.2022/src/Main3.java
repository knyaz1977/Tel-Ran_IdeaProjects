import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Input x > 0");
            x = scanner.nextInt();
        } while (x <= 0);
        System.out.println("Your x is correct");
        System.out.println("Work with x = " + x);

        // Необходимо вывести на экран числа от 1 до 5
        // На экран должно быть: 1 2 3 4 5
        int i = 1;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= 5);
    }

}


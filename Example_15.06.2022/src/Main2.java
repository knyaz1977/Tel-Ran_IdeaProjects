import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Input x > 0");
        Scanner scanner = new Scanner(System.in);
        int k = 1; // количество попыток
        int x = scanner.nextInt();
        while (x <= 0 && k < 3) {
            System.out.println("Your x <= 0!!!");
            x = scanner.nextInt();
            k++;
        }
        if (k == 3) {
            System.out.println("You have entered the maximum number of attempts, your our card is blocked.");
        }
//        if (x <= 0) {
//            System.out.println("Your x <= 0!!!");
//        }else {
        System.out.println("Your x is correct");
        System.out.println("Work with x = " + x);

        // Необходимо вывести на экран числа от 1 до 5
        // На экран должно быть: 1 2 3 4 5
        int i = 1;
        while (i <= 5) {
            System.out.println(i + " ");
            i++;
        }
    }

}


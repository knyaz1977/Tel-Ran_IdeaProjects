import java.util.Scanner;

public class Main4 {

    public class Main3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number");
            int num = scanner.nextInt();
            // если введено число не из диапазона от 1 до 7, то выходим из программы
            if (num >= 1 && num <= 7) {
                System.out.println("The correct number");
            } else {
                System.out.println("Wrong number");
            }
        }
    }
}

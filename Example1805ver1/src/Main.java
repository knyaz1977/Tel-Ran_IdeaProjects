import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Примеры работы с println
        System.out.println("Hello, world!");
        System.out.print("Hello, ");
        System.out.println("world!");


        System.out.println();

        int a;  // Объявление переменной, тип - целый, имя - a
        a = 12; // Инициализация переменной
        int b = 15; // Объявление и инициализация

        // +, -, *, /  Операторы (Основные арифметические операции)
        // = Оператор присваивания
        int c = 10 + 1;
        int d = 56 - 6;
        int e = 2 * 3;
        int f = 4 / 2;
        int g = b - a; // 15 - 12 = 3 -> g = 3

        System.out.println(g);
        System.out.println("g");
        // System.out.println(x);
        System.out.println("x");

        int j = 5 * (3 - 2) + 7;
        int h = (3 + 2) / (4 - 3);

        System.out.println();
        System.out.println("V peremennoj j hranitsa znachenie = " + j);
        System.out.println(h);

        // Ввод данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k");
        int k = scanner.nextInt();
        System.out.println("k =" + k);



    }


}

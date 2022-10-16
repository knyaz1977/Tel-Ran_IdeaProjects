import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Вычислить стоимость покупки с учетом скидки: при покупке товара на сумму больше
        // 1000 предоставляется скидка 15%
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input product price");
        double price = scanner.nextDouble();
        System.out.println("Input number of units");
        double units = scanner.nextDouble();
        // Найдем стоимость покупки
        double s = price * units;
        // i = 10
        // i = i + 1 // i++ сокращение в Java
        // x = x + 10 // x += 10 окращение в Java
        if (s > 1000) {
            s = s * 0.85; // s *= 0.85
        } // else {    // можно не использовать else
        // s = s * 1; // s *= 1
        System.out.println("s = " + s);
    }

}


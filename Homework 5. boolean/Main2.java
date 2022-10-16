import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task2
        // Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
        // открыты магазины или нет. Реализует метод boolean canBuy, который возвращает true
        // Значение этой переменной должно быть true, если открыт хотя бы один магазин, в
        // противном случае false. Отобразите строку “Я могу купить еду, это ......“ и значение.
        System.out.println();
        System.out.println("Is Edeka open? Y / N");
        String r1 = scanner.next();
        System.out.println("Is Rewe open? Y / N");
        String r2 = scanner.next();

        boolean canBuy = (isEdekaOpen(r1)) || (isReweOpen(r2));
        System.out.println(canBuy);
        if (canBuy == true) {
            System.out.println("I can buy the food. It’s " + canBuy);
        } else {
            System.out.println("I can't buy the food. It’s " + !canBuy);
        }
    }
    private static boolean isEdekaOpen(String r1) {
        if (r1.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isReweOpen(String r2) {
        if (r2.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}

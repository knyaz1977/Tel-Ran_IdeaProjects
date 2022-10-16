import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Первый уровень:
        // Task1.
        // Внедрите программу, которая принимает целое число от сканера – номер дня месяца.
        // Реализуйте метод, который принимает это целое число и возвращает строку месяца или сообщение:
        // “недопустимый аргумент”. Пример: getMonthString(3) -> Март;
        System.out.println("Input the number of day of month");
        int getMonthString = scanner.nextInt();

        month(getMonthString);
        season(getMonthString);
        System.out.println();
        System.out.println("You can get something the best at the price of $ 89.99. But if you buy two products, " +
                "you get a 10% discount on everything, and if you buy three or more, " +
                "the discount will be 15% of everything.");
        System.out.println("How many articles the user wants to buy? Input number.");
        int number = scanner.nextInt();

        discount(number, 89.99);

        System.out.println();
        System.out.println("Input three integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        isNumber(a, b, c);
    }

    private static void month(int M) {
        switch (M) {
            case 1:
                System.out.println("january");
//                System.out.println("season winter"); - Как вариант можно было 1 и 2 задание записать в одном методе.
                break;
            case 2:
                System.out.println("february");
//                System.out.println("season winter");
                break;
            case 3:
                System.out.println("march");
//                System.out.println("season spring");
                break;
            case 4:
                System.out.println("april");
//                System.out.println("season spring");
                break;
            case 5:
                System.out.println("may");
//                System.out.println("season spring");
                break;
            case 6:
                System.out.println("june");
//                System.out.println("season summer");
                break;
            case 7:
                System.out.println("july");
//                System.out.println("season summer");
                break;
            case 8:
                System.out.println("august");
//                System.out.println("season summer");
                break;
            case 9:
                System.out.println("september");
//                System.out.println("season autumn");
                break;
            case 10:
                System.out.println("october");
//                System.out.println("season autumn");
                break;
            case 11:
                System.out.println("november");
//                System.out.println("season autumn");
                break;
            case 12:
                System.out.println("december");
//                System.out.println("season winter");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }

    // Task2
    // Реализуйте метод, который принимает номер месяца и возвращает сезон (зима, весна, лето или осень),
    // к которому относится этот месяц.
    private static void season(int Month) {
        if (Month == 12 || Month == 1 || Month == 2) {
            System.out.println("season winter");
        }
        if (Month == 3 || Month == 4 || Month == 5) {
            System.out.println("season spring");
        }
        if (Month == 6 || Month == 7 || Month == 8) {
            System.out.println("season summer");
        }
        if (Month == 9 || Month == 10 || Month == 11) {
            System.out.println("season autumn");
        }
    }

    // Task3
    // Представьте, что вы пишете программу для магазина. В нем должно быть объявлено условие акции:
    // ”Вы можете получить что-то лучшее по цене $ 89,99. Но если вы покупаете два продукта,
    // вы получаете скидку 10% на все, а если вы покупаете три или более, скидка составит 15% на все".
    // Затем он должен спросить пользователя, сколько товаров пользователь хочет купить.
    // Если пользователь вводит что-то большее, чем 0, программа должна вывести сумму покупки,
    // в противном случае “Извините. Увидимся в следующий раз”
    private static void discount(int num, double price) {
        if (num <= 0) { // Чисто следуя теории абсурда, могут ввести отрицательное число и тогда получат скидку для 3х товаров!
            System.out.println("Sorry. See you next time");
            return;
        }
        double sum = (num == 1) ? price : num == 2 ? price * num * 0.9 : price * num * 0.85;
        System.out.println("The amount of the purchase is " + String.format("%.2f", sum) + "$");
    }
    // Second level:
    // Task4
    // Второй уровень: Реализуйте программу, которая просит пользователя ввести три целых числа
    // (используйте сканер) и вывести максимум три числа. Реализуйте это с помощью тернарного
    // оператора: 19,10,1 ->19

    private static void isNumber(int a, int b, int c) {
        int max =  (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        System.out.println("The maximum number of three is "  + max);
    }
}


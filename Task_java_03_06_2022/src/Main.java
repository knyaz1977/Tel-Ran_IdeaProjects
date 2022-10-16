import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) { // запускает циклическое включение метода

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя сотрудника для поиска");
            String name = scanner.next();

            String fio = selectWorkers(name);

            System.out.println("Найденый работник: " + fio);
        }
    }

    private static String selectWorkers(String name) {
        String lowerName = name.toLowerCase(); // метод toLowerCase переводит все в нижний регистр и выводит новую строку
        String iv = "Ivan".toLowerCase(); // вернула строку с нижним регистром ivan
        // if (loverCase.equaals("Ivan".toLowerCase())) { - укороченый вариант записаи!
        if (lowerName.equals(iv)) {
            return "Иван Петрович";
        } else if (lowerName.equals("Petr".toLowerCase())) {
            return "Петр Сергеевич";
        } else {
            return "Работник не найден";
        }

    }
}

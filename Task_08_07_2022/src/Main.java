import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность словаря");
        int arraysSize = scanner.nextInt();
        String[] dictionary = new String[arraysSize];

        for (int i = 0; i < arraysSize; i++) {
            System.out.println("Введите слово для словаря");

            dictionary[i] = scanner.next();
                  }
        System.out.println(Arrays.toString(dictionary));

        System.out.println("Введите слово для поиска");
        String wordToSearch = scanner.next();

        System.out.println("Найдите слова:");
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].startsWith(wordToSearch)) {
                System.out.println(dictionary[i]);
            }
        }




    }
}

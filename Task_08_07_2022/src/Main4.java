import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[123];

        System.out.println("Введите слово для обработки: ");
        String word = scanner.nextLine(); //aabbf

        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {

            alphabet[wordArray[i]]++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 0)
                System.out.println((char) i + " " + alphabet[i]);
        }

    }


}

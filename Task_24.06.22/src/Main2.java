import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] array1 = new String[5];
        System.out.println("Input name");
        for (int i = 0; i < array1.length; i++) {

            array1[i] = scanner.next();
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].startsWith("a")) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}
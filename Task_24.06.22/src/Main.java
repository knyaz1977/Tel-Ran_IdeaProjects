import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String[] array1 = new String[5]; // {200 ,120 ,200 , 120, 500, 600, 700, 500};
        int[] array1 = new int[5];
        System.out.println("Input number");
        for (int i = 0; i < array1.length; i++) {

            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + 1 + " ");
        }
    }
}

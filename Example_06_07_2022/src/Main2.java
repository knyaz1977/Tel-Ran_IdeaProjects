import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Заполнить 1-цами главную и второстепенную диагональ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  the number of rows and columns");
        int n = scanner.nextInt();
        int[][] table = new int[n][n];
        print2dArray(table);
    }

    private static void print2dArray(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            for (int j = table.length - 1 - i; j >= 0; ) {
                table[i][j] = 1;
                break;
            }
        }
        System.out.println();
        print2dArray1(table);
    }

    private static void print2dArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] table = new int[2][5];
        table[0][0] = 0;
        table[0][1] = 1;
        table[0][2] = 2;
        table[0][3] = 3;
        table[0][4] = 4;
        table[1][0] = 5;
        table[1][1] = 6;
        table[1][2] = 7;
        table[1][3] = 8;
        table[1][4] = 9;
        print2dArray(table);
        System.out.println();
        int[][] table2 = {{1, 2, 3},
                          {4, 5, 6}};
        print2dArray(table2);

        System.out.println();
        int[][] table3 = new int[5][5];
        print2dArray(table3);
        // Заполнить 1-цами главную диагональ
        print2dArray3(table3);

        // Заполнить массив с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input rows count");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] table4 = new int[n][m];
        System.out.println("Input array elements");

        print2dArray4(scanner, table4);


    }

    private static void print2dArray4(Scanner scanner, int[][] table4) {
        for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4.length; j++) {
                System.out.println("Input [" + i + "," + j + "]");
                table4[i][j] = scanner.nextInt();
            }
        }
    }

    private static void print2dArray3(int[][] table3) {
        for (int i = 0; i < table3.length; i++) {
            table3[i][i] = 1; // сделать единицы по главной диагонали
            table3[i][4-i] = 1; // чтобы и по второстепенной диагонали сделать единицы.
        }
        System.out.println();
        print2dArray(table3);
    }

    private static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
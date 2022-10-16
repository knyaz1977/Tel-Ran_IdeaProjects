import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Реализуйте метод, который принимает массив int[][] и номер строки и проверяет,
        // что среднее значение элементов в строке больше 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of rows and columns of array");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Input the number from 0 to " + (n - 1));
        int s = scanner.nextInt();

        double sum = 0;
        if (s >= 0 && s < n) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int ind = (int) (Math.random() * 20 - 10);
                    array[i][j] = ind;
                    if (i == s) {
                        sum = sum + ind;
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        } else {
            System.out.println("You input an incorrect number");
            return;
        }
        System.out.println();
        System.out.println();
        System.out.println("The sum of the elements in a row " + s + " is " + sum);
        System.out.println();
        double k = sum / m;
        if (k > 0) {
            System.out.println("The average value of the elements in row " + s + " is " + k + " and it is greater than 0");
        } else if (k < 0) {
            System.out.println("The average value of the elements in row " + s + " is " + k + " and it is less than 0");
        } else {
            System.out.println("The average value of the elements in row " + s + " is " + k + " and it is 0");
        }
        System.out.println();
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }
}

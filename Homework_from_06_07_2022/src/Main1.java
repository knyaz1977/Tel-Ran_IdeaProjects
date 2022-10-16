import java.lang.reflect.Array;

public class Main1 {

    public static void main(String[] args) {
        // Первый уровень:
        // 1. В этом задании вы должны написать программу, которая создает новый массив int[n][m],
        // заполняет его случайным целым числом и отображает его
        int n = (int) (Math.random() * 10);
        int m = (int) (Math.random() * 10);
        int[][] mas = new int[n][m];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int s = (int) (Math.random() * 10);
                mas[i][j] = s;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

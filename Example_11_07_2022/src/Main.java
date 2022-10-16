public class Main {

    public static void main(String[] args) {
        // Первый уровень:
        // 1. В этом задании вы должны написать программу, которая создает новый массив int[n][m],
        // заполняет его случайным целым числом и отображает его
        int n = (int) (Math.random() * 10);
        int m = (int) (Math.random() * 10);
        int[][] mas = new int[n][m];

        int a = -100, b = 100;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = (int) ((b - a) * Math.random() + a);

                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
    }
}
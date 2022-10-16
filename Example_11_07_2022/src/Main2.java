public class Main2 {

    public static void main(String[] args) {
        // Implement the method that takes int[][] array and line number and check checks that
        // the average of the elements in a row is greater than 0
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
        System.out.println(isGreater(mas, 2));

    }

    private static boolean isGreater(int[][] array, int lineNumber) {
        int length = array[0].length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[lineNumber][i];
        }
//        if (sum/length > 0) {
//            return true;
//        }else{
//            return false;
//        }
        return (double) sum / length > 0;
    }


}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main4 {
//
//    public static void main(String[] args) {
//        // Реализуйте метод, который принимает массив int[][] и номер строки и проверяет,
//        // что среднее значение элементов в строке больше 0
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the number of rows and columns of array");
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] array = new int[n][m];
//
//        System.out.println("Input the number from 0 to" + n);
//        int s = scanner.nextInt();
//        int i = 0;
////        int z(i) = 0;
//        for (; i < array.length; i++) {
//            int z(i) = 0;
//            for (int j = 0; j < array[i].length; j++) {
//                int ind = (int) (Math.random() * 10);
//                array[i][j] = ind;
//
//                z(i) = z(i) + ind;
//                System.out.print(array[i][j] + " ");
//
//            }
//        }
//        System.out.println();
//        System.out.println("The sum of the elements in a row " + s + " is " + z);
//        System.out.println();
//        if (z / 2 > 0) {
//            System.out.println("The average of the elements in a row " + s + " is greater than 0");
//        } else if (z / 2 < 0) {
//            System.out.println("The average of the elements in a row " + s + " is less than 0");
//        } else {
//            System.out.println("The average of the elements in the row " + s + " is 0");
//        }
//        System.out.println();
//        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
//
//
//    }
//}

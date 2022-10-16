import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        char a = ('(');
        char b = (')');
        int s = n * 2;
        char[] array = new char[s];
        for (int i = 0; i < n; i++) {
            array[i] = a;
            for (int j = s - 1; j >= n; j--) {
                array[j] = b;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        char[] array2 = array;
        for (int k = 1; k < n; k++) {
//            char[] array2 = array;
            for (int c = n; c < s - 1; c++) {
                char[] array3 = array2;
                char temp = array3[k];
                array3[k] = array3[c];
                array3[c] = temp;
//                char[] array3 = array2;
//                System.out.println(Arrays.toString(array3));
                ////
//                return array3;
            }

        }
        ///

        for (int i = n; i < s - 1; i++) {
            for (int j = n + 1; j < s - 1; j++) {
                char temp1 = array3[i];
                array3[i] = array3[j];
                array3[j] = temp1;
                char[] array4 = array3;//
//                        System.out.println(Arrays.toString(array4));
            }
//                    return;
        }
        System.out.println();

    }
}
//}
//        }



// //            for (int j = s - 2; j >= n; j--) {
////                char temp2 = array2[j];
////                array2[i] = temp2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 23;
        array[1] = 56;
        array[2] = -23;
        array[4] = 203;
        array[5] = 506;
        array[6] = 78;
        array[7] = 1;
        array[8] = 3;
        array[9] = 6;
        for (int i = 0; i < array.length; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(array[i]);
        }
        String[] students = new String[5];
        System.out.println("Input 5 names");
        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.nextLine();
        }
        System.out.println("Entered names:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        double[] dblArray = {3.14, 2.5, -0.7}; // array angl. массив
//        double[] dblArray = new double[3];
//        dblArray[0] = 3.14;
//        dblArray[1] = 2.5;
//        dblArray[2] = -0.7;

        String[] months = {"January", "February"};


    }


}

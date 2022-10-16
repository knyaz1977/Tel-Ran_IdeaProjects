import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Input temperature1 ");
        double temperature1 = scanner.nextDouble();
        System.out.println("Input temperature2 ");
        double temperature2 = scanner.nextDouble();
        task3(temperature1, temperature2);

        // task2
        System.out.println();
        System.out.println("Input three integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max(a, b, c));
    }
    private static void task3(double temperature1, double temperature2) {
        System.out.println(temperature1 > 100 && temperature2 < 100);
    }

    private static int max(int a,int b,int c){
        if (a >= b && a >= c) {
            return a;
        }  if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

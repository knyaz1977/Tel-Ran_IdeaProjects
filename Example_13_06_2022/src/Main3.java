import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        // найти сумму чисел от 1 до 5 с помощью цикла
        int s = 0; // коротко можно записать int s; при очень больших числах long s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        System.out.println("sum from 1 to " + n + ": " + s);
    }
}

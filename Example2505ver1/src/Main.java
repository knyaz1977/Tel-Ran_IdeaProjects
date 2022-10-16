import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        //
        System.out.println("Your name start with char " + name.charAt(0));
        //
        System.out.println("Input number1");
        int number1 = scanner.nextInt();
        System.out.println("Input number2");
        int number2 = scanner.nextInt();
        System.out.println("avg = " + ((double)(number1+number2)/2.0));
        // Task5
        System.out.println("Hyp= " + Math.sqrt(Math.pow(number1, 2) + Math.pow(number2, 2)));

    }
}

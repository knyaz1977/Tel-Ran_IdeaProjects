import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name ");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");

        // Task2
        System.out.println();
        System.out.println("Input your name ");
        String name1 = scanner.next();
        System.out.println("Your name start with char " + (name1.charAt(0)));

        // Task3
        System.out.println();
        System.out.println("Set the edge length of the cube ");
        double a = scanner.nextDouble();
        System.out.println("Volume of the cube is " + Math.pow(a, 3) + " and the area of its side surface is " + (6*Math.pow(a, 2))); // Если перед Math поставить (int), ответ будет целое число.


        // Task4
        System.out.println();
        System.out.println("Input real number1 ");
        double number1 = scanner.nextDouble();
        System.out.println("Input real number2 ");
        double number2 = scanner.nextDouble();
        double arm = (number1 + number2) / 2;
        System.out.println("the arithmetic mean of these numbers is " + arm);

        // Task5
        System.out.println();
        System.out.println("Input cathetus1 ");
        double cath1 = scanner.nextDouble();
        System.out.println("Input cathetus2");
        double cath2 = scanner.nextDouble();
        double g2 = Math.pow(cath1, 2) + Math.pow(cath2, 2);
        System.out.println("The hypotenuse of the triangle is equal to " + Math.sqrt(g2));


    }
}

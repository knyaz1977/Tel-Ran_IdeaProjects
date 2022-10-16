import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // First level:
        // Task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1");
        int number1 = scanner.nextInt();
        System.out.println("Input number2");
        int number2 = scanner.nextInt();
        int c = number1 + number2;
        int d = number1 - number2;
        System.out.println("Sum of number1 = " + number1 + " and number2 = " + number2 + " is " + c);
        System.out.println("Difference of number1 = " + number1 + " and number2 = " + number2 + " is " + d);

        // Task2
        System.out.println();
        System.out.println("Input the side1 of the rectangle");
        int side1 = scanner.nextInt();
        System.out.println("Input the side2 of the rectangle");
        int side2 = scanner.nextInt();
        int s = side1 * side2;
        System.out.println("The area of the rectangle with side1 = " + side1 + " and side2 = " + side2 + " is " + s);

        // Task3
        System.out.println();
        int e = 12;
        int f = 3;
        int j = e + f;
        int h = e - f;
        System.out.println(e + "+" + f + "=" + j);
        System.out.println(e + "-" + f + "=" + h);
        // Taask4
        System.out.println();
        System.out.println("Input the radius of the circle");
        int r = scanner.nextInt();
        System.out.println("The area of a circle with radius " + r + " is " + 3.14 * r * r);

        // Second level:
        // Task5
        System.out.println();
        int r1 = 28 / 2;
        int r2 = 24 / 2;
        double dk = (3.14 * r1 * r1 - 3.14 * r2 * r2) * 40;
        System.out.println("The amount of additional calories will be " + (int) dk);
    }

}

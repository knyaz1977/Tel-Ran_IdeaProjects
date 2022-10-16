import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the radius of the circle");
        double r = scanner.nextDouble();
        double s = Math.PI * Math.pow(r, 2); // Pi=3.14 возвели в степень(в квадрате)
        System.out.println("The area of a circle with radius " + r + " is " + s);

    }
}

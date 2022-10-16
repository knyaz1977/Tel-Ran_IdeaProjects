import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side1");
        int side1 = scanner.nextInt();
        System.out.println("Input side2");
        int side2 = scanner.nextInt();
        System.out.println("The area of the rectangle with side1 = " + side1 + " and side2 = " + side2 + " is " + side1 * side2);

    }
}

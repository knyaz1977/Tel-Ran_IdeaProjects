import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SquareEquation squareEquation = new SquareEquation(4,-4,1);
//        Roots roots = new Roots();
//
//        System.out.println();
//        squareEquation.Solution(4,7,3);
//        System.out.println(roots.x1);
//        System.out.println(roots.x2);

//        Roots result = squareEquation.Solution(4, -4, 1);
//        System.out.println(result.x1);
//        System.out.println(result.x2);

        Roots result = new Roots();
        result.x1 = (-2 - Math.sqrt(-16)) / (2 * 4);
        result.x2 = (-2 + Math.sqrt(-16)) / (2 * 4);
        System.out.println(result.x1);
        System.out.println(result.x2);
    }
}

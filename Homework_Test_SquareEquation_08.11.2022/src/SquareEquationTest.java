import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

class SquareEquationTest {
    // Легко догадаться, что в данном коде
    // реализовано решение квадратных уравнений.
    // Необходимо покрыть тестами класс
    // SquareEquation.

    SquareEquation squareEquation;

    @Test
    void solutionTest() {
        SquareEquation squareEquation = new SquareEquation(4, 7, 3);
        Roots result = squareEquation.Solution(4, 7, 3);
        Assertions.assertEquals(-0.75, result.x2);
    }

    @Test
    void solutionTest1() {
        SquareEquation squareEquation = new SquareEquation(4, 7, 3);
        Roots result = squareEquation.Solution(4, 7, 3);
        Assertions.assertEquals(-1, result.x1);
    }

    @Test
    void solutionTest2() {
        SquareEquation squareEquation = new SquareEquation(4, -4, 1);
        Roots result = squareEquation.Solution(4, -4, 1);
        Assertions.assertEquals(0.5, result.x1);

    }

    @Test
    void solutionTest3() {
        SquareEquation squareEquation = new SquareEquation(4, -4, 1);
        Roots result = squareEquation.Solution(4, -4, 1);
        Assertions.assertEquals(0.5, result.x2);

    }

//    @Test
//    void solutionTest4() {
//        SquareEquation squareEquation = new SquareEquation(2, 3, 4);
//        Roots result = squareEquation.Solution(2, 3, 4);
//        Assertions.assertEquals(-23.0, result.x1);
//    }
//
//    @Test
//    double solutionTest5() {
//        SquareEquation squareEquation = new SquareEquation(2, 3, 4);
//        Roots result = squareEquation.Solution(2, 3, 4);
//        Assertions.assertFalse( false, "Solution has no roots");
//        return result.x1;
//    }
}

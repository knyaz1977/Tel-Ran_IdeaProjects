import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

class SquareEquationTest {
    // Легко догадаться, что в данном коде
    // реализовано решение квадратных уравнений.
    // Необходимо покрыть тестами класс
    // SquareEquation.

    SquareEquation equation;

    @Test
    void solutionTest() {
        Roots result = new Roots();
        result.x1 = -3;
        result.x2 = 2;
        SquareEquation equation = new SquareEquation(1, 1, -6);
        Roots roots = equation.solution();
        Assertions.assertEquals(-3, roots.x1);
        Assertions.assertEquals(2, roots.x2);
    }

    @Test
    void solutionTest2() {
        Roots result = new Roots();
        result.x1 = 5;
        result.x2 = 5;
        SquareEquation equation = new SquareEquation(1, -10, 25);
        Roots roots = equation.solution();
        Assertions.assertEquals(5, roots.x1);
        Assertions.assertEquals(5, roots.x2);

    }
@Test
    void solutionTest3() {
    Assertions.assertThrows(ArithmeticException.class, () -> {
        SquareEquation equation = new SquareEquation(1, 2, 3);
        equation.solution();
    });


    }

    @Test
    void solutionTest4() {
        SquareEquation equation = new SquareEquation(4, 7, 3);
        Roots result = equation.solution();
        Assertions.assertEquals(-1, result.x1);
    }

    @Test
    void solutionTest5() {
        SquareEquation equation = new SquareEquation(4, -4, 1);
        Roots result = equation.solution();
        Assertions.assertEquals(0.5, result.x1);

    }

    @Test
    void solutionTest6() {
        SquareEquation squareEquation = new SquareEquation(4, -4, 1);
        Roots result = squareEquation.solution();
        Assertions.assertEquals(0.5, result.x2);

    }

//    @Test
//    void solutionTest7() {
//        SquareEquation squareEquation = new SquareEquation(2, 3, 4);
//        Roots result = squareEquation.Solution(2, 3, 4);
//        Assertions.assertEquals(-23.0, result.x1);
//    }
//
//    @Test
//    double solutionTest8() {
//        SquareEquation squareEquation = new SquareEquation(2, 3, 4);
//        Roots result = squareEquation.Solution(2, 3, 4);
//        Assertions.assertFalse( false, "Solution has no roots");
//        return result.x1;
//    }
}

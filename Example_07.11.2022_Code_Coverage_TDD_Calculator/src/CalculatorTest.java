import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beginAll() {
        // Сюда можно поместить код, который должен быть выполнен перед всеми
        // тестами
    }

    // Метод, помеченный этой аннотацией запускается перед каждым тестом
    @BeforeEach
    void begin() {
        calculator = new Calculator();
    }

    @Test
    void addTest() {
        int result = calculator.add(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    void addTest2() {
        int result = calculator.add(1, 2);
        Assertions.assertNotEquals(4, result);
    }

    @Test
    void addEven() {
        Assertions.assertTrue(calculator.isEven(4));
    }

    @Test
    @Disabled("Этот метод пока не нужно тестировать")
    void addEven2() {
        Assertions.assertFalse(calculator.isEven(5));
    }

    @Test
    @Timeout(1000)
        // По истечению 1 сек тест считается проваленным
    void subTest() {
        int result = calculator.sub(1, 2);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void mulTest() {
        int result = calculator.mul(1, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    void div() {
        int result = calculator.div(2, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void getIntegerTest() {
        Assertions.assertNull(calculator.getInteger(1));
    }

//    @Test
//    void getException() {
//        Assertions.assertThrows(ArithmeticException.class,
//                Executable.class.cast(calculator.add(1,2)));
//
//    }

    @AfterEach
    void end() {
        // Сюда можно поместить код, который нужно выполнить после
        // каждого теста
    }

    @AfterAll
    static void endAll() {
        // Сюда можно поместить код, который нужно выполнить после
        // всех тестов
    }

}



import org.junit.jupiter.api.Assertions;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    // Проверка на четность числа а
    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public Integer getInteger(int a) {
        return null;
    }

}
package telran;

public class Overload {

    // В Java используется тип и/или количество аргументов метода для
    // определения того метода, который нужно вызывать
    // тип возвращаемого значения не используется!!!

    void test() {
        System.out.println("Without parameters");
    }

    void test(int a) {
        System.out.println("With one int parameter");
    }

    void test(int a, int b) {
        System.out.println("With two int parameter");
    }

    void test(double a) {
        System.out.println("With one double parameter");
    }
}

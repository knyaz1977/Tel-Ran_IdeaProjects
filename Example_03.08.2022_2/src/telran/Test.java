package telran;

public class Test {

    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Возвратить логическое значение true, если в качестве параметра

    boolean equalTo(Test obj) {
        return obj.a == a && obj.b == b;
    }
    // Метод клонирующий текущий объект
    Test copy() {
        return new Test(a, b);
    }

}

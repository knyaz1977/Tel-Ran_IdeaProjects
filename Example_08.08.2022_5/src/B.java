public class B extends A {

    int i; // Этот член скрывает член i из класса A

    B(int a, int b) {
        super.i = a; // член i из класса А инициализирован переменной a
        i = b; // член i из класса В инициализирован переменной b
    }

    void show() {
        System.out.println("i from superclass " + super.i);
        System.out.println("i from subclass " + i);
    }

}

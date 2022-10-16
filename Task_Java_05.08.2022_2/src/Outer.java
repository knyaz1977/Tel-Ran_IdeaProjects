public class Outer {

    int outer_x = 100;// область видимости весь класс Outer

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

   private class Inner {
        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }


}

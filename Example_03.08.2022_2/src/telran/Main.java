package telran;

public class Main {

    public static void main(String[] args) {
        // Перегрузка методов - это одна из реализаций полиморфизма
        Overload obj = new Overload();
        obj.test();
        obj.test(1);
        obj.test(1, 2);
        obj.test(3.14);

        Box myBox1 = new Box();
        Box myBox2 = new Box(10, 20, 15);
        Box myBox3 = new Box(10);
    // telran.Box mzBox4 =

        Test obj1 = new Test(1,2);
        Test obj2 = new Test(1,2);
        Test obj3 = new Test(2,3);

        System.out.println(obj1.equalTo(obj2));
        System.out.println(obj1.equalTo(obj3));
        System.out.println(obj1 == obj2);
        System.out.println(obj1);
        System.out.println(obj2);

        // Клонируем объект obj1. obj4 - клон obj1
        Test obj4 = obj1.copy();
        ////////////////////////////////////////////
        Test1 obj5 = new Test1();
        // Эти операторы правильный поэтому члены а и b
        // данного класса доступны непосредственное
        obj5.a = 10;
        obj5.b = 20;

        // Этот оператор неверен и может вызывать ошибку
        // obj5.c = 100;
        //

        obj5.setC(100) ;
        System.out.println(obj5.getC());

//        int a;
//        a = 10; // set
//        System.out.println(a); // get

        double r = 12.0;
        final double pi = 3.14; // final - константа, менять уже нельзя
        double s = pi * r * r;
//        pi = 45;  Ошибка
//        double s = pi * r * r;
/////////////////////////////

        Test1 obj6 = new Test1();
        System.out.println(Test1.counter);
//      System.out.println(obj6.counter);
        Test1 obj7 = new Test1();
        System.out.println(Test1.counter);
//      System.out.println(obj7.counter);
    }
}

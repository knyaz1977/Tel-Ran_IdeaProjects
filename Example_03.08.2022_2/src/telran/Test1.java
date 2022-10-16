package telran;

public class Test1 {

    // Модификаторы доступа:
    // public, private, protected, default
    // public - член класса доступен из любого другого кода
    // private - член класса доступен только внутри этого класса
    // default - "package-private" член класса доступен только внутри текущего пакета


    int a; // default (с полем можно работать  внутри пакета)
    public int b;  // открытый член класса
    private int c; // закрытый член класса (с полем можно работать только внутри класса telran.Test1)

    // Геттер - используется для получения (чтения) значения поля с
    public static int counter = 0;
    public Test1() {
        counter++;
    }



    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

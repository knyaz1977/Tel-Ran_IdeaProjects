public class B extends A {

    int k;

    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    // Вывести содержимое переменной k с помощью метода,
    // переопределяющего метод show() из класса А
//  void show() {
//  System.out.println("k = " + k);
//}
    @Override// - переопределение. show B перепишет(переопределит) show A
    void show() {
        super.show(); // Здесь вызывается метод show() из класса A
        System.out.println("k = " + k);
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return "B{" +
                "k=" + k +
                "} " + superString;
    }
}

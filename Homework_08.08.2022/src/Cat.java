public class Cat extends Animal {

    private static final int MAX_RUN_DISTANS = 200; // задаем константу в классе Cat,
    // указывается вверху!

    public Cat(String name) { // конструктор создает кошку
        super(name); // super - вызывает конструктор из вышестоящего класса(Animal)
    }

    public void run(int distance) {
        if (distance > MAX_RUN_DISTANS) {
            System.out.println(getName() + " not run " + distance);
        } else {
            System.out.println(getName() + " run " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println(getName() + " not swim ");

    }

}

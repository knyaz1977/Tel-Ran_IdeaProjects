public class Dog extends Animal{

    private static final int MAX_RUN_DISTANS = 500;
    private static final int MAX_SWIM_DISTANS = 10;
    //    private static final int MAX_SWIM_DISTANS = 10;

    public Dog(String name) { // конструктор создает собаку
        super(name); //super - вызывает конструктор из вышестоящего класса(Animal)
    }

    public  void run(int distance) {
        if (distance > MAX_RUN_DISTANS) {
            System.out.println(getName() + " not run " + distance);
        } else {
            System.out.println(getName() + " run " + distance);
        }

    }
    public  void swim(int distance) {
        if (distance > MAX_SWIM_DISTANS) { // указать число и потом нажать CTRL+ALT+C =>
            // предложит поменять на константу (добавить ее имя "MAX_SWIM_DISTANS" и нажать ENTER).
            System.out.println(getName() + " not swim " + distance);
        } else {
            System.out.println(getName() + " swim " + distance);
        }

    }
}

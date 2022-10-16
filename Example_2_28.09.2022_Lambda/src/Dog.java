public class Dog {

    String name;
    int age;
    int weight;

    public Dog(String name, int age, int weight) {
        this.name  = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 5, 10);

        Converterable<Dog, Raccon> converterable1 = x -> new Raccon(x.name, x.age, x. weight);

        Raccon raccoon = converterable1.convert(dog);

        System.out.println(dog);
        System.out.println(raccoon);

    }
}

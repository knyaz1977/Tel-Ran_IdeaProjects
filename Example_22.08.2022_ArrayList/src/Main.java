import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>(); // динамический массив. Cписок типа Array
        cats.add(new Cat("A")); // Добавляем кошек в список Array
        cats.add(new Cat("B"));

        Cat c = new Cat("C"); // Объекту класса Cat добавили имя с
        cats.add(c);

        cats.add(new Cat("Qwerty"));

        System.out.println(cats);
        System.out.println("size = " + cats.size());

        cats.remove(1);// remove удалить объект по индексу 1
        System.out.println(cats);
        System.out.println("size = " + cats.size());

        cats.remove(c);// remove удалить объект класса Cat по имени c
        System.out.println(cats);
        System.out.println("size = " + cats.size());

        for (int i = 0; i < 110; i++) {
            cats.add(new Cat(Integer.toString(i)));
        }
        Cat[] cats1 = {new Cat("A"),
                new Cat("B"),
                new Cat("C"),
                new Cat("Qwerty")};
        System.out.println(Arrays.toString(cats1));
        cats1[1] = null;
        System.out.println(Arrays.toString(cats1));
        for (int i = 2; i < cats1.length; i++) {
            cats1[i - 1] = cats1[i];
            cats1[i] = null;
        }
        System.out.println(Arrays.toString(cats1));
    }

    private void deleteCat(Cat[] cats, int deleteIndex) {

    }
}

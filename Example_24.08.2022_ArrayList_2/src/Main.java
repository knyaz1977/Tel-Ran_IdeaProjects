import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Murzik"));
        Cat cat3 = new Cat("Qwerty");
        cats.add(cat3);
        cats.add(new Cat("QWERTY"));
        cats.add(new Cat("Asdf"));

        System.out.println(cats);

        // Цикл с параметром
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName() == "Barsik") {
                cats.remove(i);
            }
        }
        System.out.println(cats);

        // Цикл for-each
        // Exception in thread "main" java.util.ConcurrentModificationException
        // Нельзя производить одновременно перебор коллекции и изменять ее элементы
//        for (Cat cat : cats) {
//            if (cat.getName() == "Murzik") {
//                cats.remove(cat);
//            }
//        }
//        System.out.println(cats);

        // Как решить с удалением
        Cat deletedCAt = null;
        for (Cat cat : cats) {
            if (cat.getName() == "Murzik") {
                deletedCAt = cat;
                break;
            }
        }
        cats.remove(deletedCAt);
        System.out.println(cats);

        // Решение № 2 - копия всей коллекции (итерация по одной коллекции, а удаление по другой)
        ArrayList<Cat> copyCats = new ArrayList<>();
        for (Cat cat : copyCats) {
            if (cat.getName() == "Asdf") {
                cats.remove(cat);
            }
        }

        System.out.println(cats);


//
//        System.out.println(cats);
//        System.out.println("size = " + cats.size());

//        cats.remove(cat3); // cats.remove("Qwerty");
//        cats.remove(2); // cats.remove("Qwerty");


//        Cat[] cats = {new Cat("Barsik"),
//                new Cat("Murzik"),
//                new Cat("QWERTY"),
//                new Cat("Asdf")};
//        System.out.println(Arrays.toString(cats));
//        cats[1] = null;
//        System.out.println(Arrays.toString(cats));
//        for (int i = 2; i < cats.length; i++) {
//            cats[i - 1] = cats[i];
//            cats[i] = null;
//        }
//        System.out.println(Arrays.toString(cats));


//        Arrays.copyOf()
    }
//    private void  deleteCat(Cat[] cats, int deleteIndex) {
//  }

}

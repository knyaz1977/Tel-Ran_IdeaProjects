import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;

public class Main2 {

    public static final int CATS_COUNT = 12;

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < CATS_COUNT; i++) { //  for (int i = 0; i < cats.size(); i++)
            cats.add(new Cat("Cat N " + Integer.toString(i))); // + называется контининация,
            // можно писать без Integer.toString
        }
        // Интерации по коллекции
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName());
        }
        System.out.println();

        // С помощью цикла for-each
        // для каждого объекта cat из коллекции cats
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
        // С помощью итератора
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
//            Cat cat = iterator.next();
//            System.out.println(cat.getName());
            System.out.println(iterator.next().getName());
        }
        // Поиск и удаление элемента с помощью цикла по индексу
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals("Cat N 5")) {
                cats.remove(i);
            }
        }
        System.out.println(cats);

        System.out.println();

        // Поиск и удаление элемента с помощью цикла по индексу
        for (Cat cat : cats) {
            if (cat.getName().equals("Cat N 5")) {
                cats.remove(cat);
            }
        }
        System.out.println(cats);
    }
}

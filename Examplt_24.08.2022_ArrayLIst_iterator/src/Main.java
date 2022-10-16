import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

        // Получение итератора
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) { // метод  hasNext
            Cat cat = iterator.next();  // получение очередного кота
            if (cat.getName() == "Barsik") {
                iterator.remove(); // удалили через iterator -> для перебора и изменения коллекций
            }
        }

        System.out.println(cats);
        // Использование ListIterator-a
        ListIterator<Cat> listIterator = cats.listIterator(cats.size()-1);
        while (listIterator.hasPrevious()) {
            Cat cat = listIterator.previous(); // previous -> предыдущий
            cat.setName("egryy");
            System.out.println(cat);
        }

    }
}

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
        cats.add(new Cat("Asdf"));
        cats.add(new Cat("Zxcv"));
        cats.add(new Cat("Kis_kis"));
        cats.add(new Cat("Bris"));

        System.out.println(cats);
        // Цикл с параметром
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getId() == "Barsik") {
                cats.remove(i);
//                break; // если барсик 1, то выйти из цикла break

            }
        }
        System.out.println(cats);

        // Exception in thread "main" java.util.ConcurrentModificationException
        // Нельзя проводить одновременно перебор коллекции и изменение ее элементов
        // Цикл for-each
        //----------------------------
        for (Cat cat : cats) {
            if (cat.getId() == "Murzik") {
                cats.remove(cat);
                break; // с break отрабатывает
            }
        }
        System.out.println(cats);
        //---------------------------

        // Exception in thread "main" java.util.ConcurrentModificationException
        // Нельзя проводить одновременно перебор коллекции и изменение ее элементов
//        for (Cat cat : cats) {
//            cats.add(new Cat("New cat"));
//        }
//        System.out.println(cats);
        // Как решить с удалением:
        Cat deletedCat = null;
        for (Cat cat : cats) {
            if (cat.getId() == "Qwerty") {
                deletedCat = cat;
                break;
            }
        }
        cats.remove(deletedCat);
        System.out.println(cats);

        // Решение № 2 - копия всей коллекции(итерация по одной коллекции, а удаление во второй.
        ArrayList<Cat> copyCats = new ArrayList<>(cats); // Ставим курсор в пустые скобки(ArrayList<>(|)) и нажимаем  (CTRL + P).
        // ArrayList<>(cats) => копируем все элементы cats в copyCats
        for (Cat cat : copyCats) {
            if (cat.getId() == "Asdf") {
                cats.remove(cat);
            }
        }
        System.out.println(cats);

        // Получение итераторов
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next(); // получение очередного кота
            if (cat.getId() == "Zxcv") {
                iterator.remove();
            }
        }
        System.out.println(cats);


        // Использование ListIterator-а
        ListIterator<Cat> listIterator = cats.listIterator(cats.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex()); // выводить предыдущий индекс
            Cat cat = listIterator.previous(); // выводить предыдущий элемент
            cat.setId("efged;dgg;gdd");
            listIterator.set(cat);
            System.out.println(cat);
        }
    }
}


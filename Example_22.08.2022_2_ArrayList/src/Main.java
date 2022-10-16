import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
//        cats.add(new Cat("A"));
//        cats.add(new Cat("B"));
//        cats.add(new Cat("C"));
//        System.out.println(cats.size());
        for (int i = 0; i < 12; i++) {
            cats.add(new Cat(Integer.toString(i)));
        }
        // Размер коллекции
        System.out.println(cats.size());
        Cat catLast = new Cat("CatLast");
        // добавляются новые элементы в arrayLIst всегда в конец
        cats.add(catLast); // если не указать индекс поставит в конец массива
        // Вывод на экран индекса объекта Cat
        System.out.println(cats.indexOf(catLast));

        Cat catFirst = new Cat("CatFirst");
        cats.add(0, catFirst); // если указать индекс поставит значение на это место с заменой
        System.out.println("-------");
        System.out.println(cats.indexOf(catLast));
        System.out.println(cats.indexOf(catFirst));
        System.out.println(cats.size());
        System.out.println("-------");

        // Получим catLast по индексу
        Cat catFromCollection = cats.get(13);
        System.out.println(catFromCollection); //  можно вывести через get
        Cat catFromCollection2 = cats.get(12);
        System.out.println(catFromCollection2);
        // Проверка наличия объекта в коллекции
        System.out.println(cats.contains(catLast));

        // Изменение элемента коллекции
        cats.set(0, catLast); // если не указать индекс поставит в конец массива
        System.out.println(Arrays.toString(cats.toArray()));
        System.out.println(cats);

        cats.set(5, null);
        System.out.println(cats);
        System.out.println(cats.get(5));

        // очищаем список
        cats.clear();
        System.out.println(cats);


    }
//        Cat[] cats = {new Cat("A"),
//                new Cat("B"),
//                new Cat("C")};
//        cats[1] = null;
//        System.out.println(Arrays.toString(cats));

}



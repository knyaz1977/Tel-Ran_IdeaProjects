import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
// First level: Написать итератор по массиву. Подсказка: должен быть реализован класс
// (назовем его, например, ArrayIterator), который реализует интерфейс Iterator.
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> integerIterator = list.iterator();

        Integer[] integerArray = {10, 20, 3, -4, -5};

        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(integerArray);
        while (arrayIterator.hasNext()) { // пока arrayIterator.hasNext имеет следующий элемент
            int value = arrayIterator.next();
            if (value == 3) {
                arrayIterator.remove();
            }
//           System.out.println(value); // выведи следующий элемент
        }
        System.out.println(Arrays.toString(integerArray));

        // Создание итератора

        // Тестирование второго способа
//        Iterator<Integer>

    }

    // Реализация с помощью обобщенного метода, возвращающего Iterator
    private static <T> Iterator<T> getIterator(T[] array) {
        return new Iterator<T>() {

            private int count = array.length;
            ;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];

                } else {
                    System.out.println("No such element!");
                    return null;
                }
            }
        };
    }
}

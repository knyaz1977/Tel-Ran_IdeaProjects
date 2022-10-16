import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        System.out.println("Before we add anything myHashSet size is " + myHashSet.size());
        System.out.println("At the beginning myHashSet is empty: " + myHashSet.isEmpty());
        myHashSet.add(1); // add() - добавляет элемент в множество.
        myHashSet.add(2);
        myHashSet.add(3);
        // попробуем добавить элемент, который у нас уже есть - например единицу:
        myHashSet.add(1);
        System.out.println("Before remove:");
        for (int i : myHashSet)
            System.out.println(i);
        System.out.println("After adding elements myHashSet is empty: " + myHashSet.isEmpty());
        // isEmpty() - возвращает true если множество пустое, и false если там есть хотя бы один элемент:
        System.out.println();
        System.out.println("Now myHashSet size is " + myHashSet.size()); // size() - возвращает размер множества.
        System.out.println();
        System.out.println("Does myHashSet contain '1'? " + myHashSet.contains(1)); // contains() - определяет,
        // есть ли элемент в множестве.
        System.out.println("Does myHashSet contain '11'? " + myHashSet.contains(11));
        System.out.println();
        myHashSet.remove(1);//remove() - удаляет элемент из множества.
        System.out.println("After remove:");
        for (int i : myHashSet) {
            System.out.println(i);
        }
        System.out.println("Now myHashSet size is " + myHashSet.size());
        System.out.println();

        myHashSet.clear();
        System.out.println("After clear myHashSet size is " + myHashSet.size());
        //clear() - удаляет все элементы из коллекции:
        System.out.println("After clear myHashSet is empty: " + myHashSet.isEmpty());
    }
}

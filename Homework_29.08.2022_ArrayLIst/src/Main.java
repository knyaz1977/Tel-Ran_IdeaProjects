import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Second level: Дан ArrayList, содержащий целые числа и число k.
        // Необходимо циклически сдвинуть числа в ArrayList вправо на k позиций.
        // Например, 1 - 2 - 3 - 4 - 5 - 6 при k = 1 преобразуется в 6 - 1 - 2 - 3 - 4 - 5,
        // а при k = 3 в 4 - 5 - 6 - 1 - 2 - 3.
        int k = 32;

        ArrayList<ArrList> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrList(1));
        arrayLists.add(new ArrList(2));
        arrayLists.add(new ArrList(3));
        arrayLists.add(new ArrList(4));
        arrayLists.add(new ArrList(5));
        arrayLists.add(new ArrList(6));

        System.out.println(arrayLists);
        int t = arrayLists.size();
        for (int i = arrayLists.size() - 1; k > 0; k--) {
            arrayLists.add(0, arrayLists.get(i));
            arrayLists.remove(t);
        }
        System.out.println(arrayLists);
    }
}
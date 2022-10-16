import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    //В деке находятся целые числа. Добавить в дек столько элементов,
    // чтобы он стал в два раза длиннее и симметричным,
    // то есть: первый элемент был равен последнему,
    // второй – предпоследнему и так далее.
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList<>();
        Deque deque1 = new Deque();
        deque1.addFirst(1);
        deque1.addLast(2);
        deque1.addLast(3);
        deque1.addLast(4);
        deque1.addLast(5);
        
        while (!deque1.isEmpty()) {
            arrayList.add(deque1.deleteFirst());
        }
        System.out.println(arrayList);

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int temp = (int) arrayList.get(i);
            deque1.addFirst(temp);
            deque1.addLast(temp);
        }

        while (!deque1.isEmpty()) {
            arrayList2.add(deque1.deleteFirst());
        }
        System.out.println(arrayList2);
    }
}
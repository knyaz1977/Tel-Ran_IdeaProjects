import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        // Реализует функционал queue и deque в полной мере
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("123");
        linkedList.addLast("678");
        String firstElement = linkedList.removeFirst();
        String lastElement = linkedList.removeLast();

        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.get(0);  // Получение элемента по индексу


    }
}

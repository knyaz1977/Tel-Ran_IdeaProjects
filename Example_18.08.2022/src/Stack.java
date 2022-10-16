public class Stack {

    private StackItem top; // = null JVM делает сама, писать необязательно.

    public void push(int item) { // меняем item на char
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public int pop() {
        int a = top.value;
        // Сдвинуть top
        top = top.next;
        return a;
    }

    public int top() {
        return top.value;
    }

    public int previousTop() {
        return top.next.value;
    }

    public boolean isEmpty() {
        return (top == null); // если top == null то вернет true
    }

    private class StackItem { // private закрытый класс внутри класса Stack
        int value;
        StackItem next; // StackItem - тип
    }

}

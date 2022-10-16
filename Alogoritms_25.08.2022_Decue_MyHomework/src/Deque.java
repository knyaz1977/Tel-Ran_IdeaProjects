public class Deque {

    private DequeItem head = null;

    private DequeItem tail = null;

    public void addFirst(int item) {
        DequeItem temp = new DequeItem();
        temp.value = item;
        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            head.previous = temp;
            temp.next = head;
            head = temp;
        }
    }

    public void addLast(int item) {
        DequeItem temp = new DequeItem();
        temp.value = item;
        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            head = null;
        } else {
            head.previous = null;
        }
        return value;
    }

    public int deleteLast() {
        int value = tail.value;
        tail = tail.previous;
        if (tail == null) {
            tail = null;
        } else {
            tail.next = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object o) {
    }

    public void addLast(Object o) {
    }

    private class DequeItem {
        int value;
        DequeItem next;
        DequeItem previous;


    }

}

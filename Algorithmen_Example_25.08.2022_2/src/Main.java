import telran.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
        System.out.println(queue.isEmpty());
    }
}


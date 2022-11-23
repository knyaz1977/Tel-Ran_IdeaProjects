public class Main2 {

    public static void main(String[] args) {
        Queue q = new Queue();
        new Producer(q);
        new Consumer(q);
    }
}

// Очередь
class Queue {
    private int n;

    private boolean valueSet = false; // valueSet - значение получено

    public synchronized void get() {
        while (!valueSet) { // Повесили флаг
            try {
                wait(); // ждать
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Получено: " + n);
        valueSet = false; // товар забрали
        notify();
    }

    public synchronized void put(int n) { // put - доставляет ящик на склад
        while (valueSet) { // пока доставляем ящик на склад
            try {
                wait(); // ждать
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true; // доставили товар // данные установленны
        System.out.println("Отправлено: " + n);
        notify(); // Говорит потоку get данные поступили. Просыпайся и тот запустится после сна (wait)
    }
}

// Поставщик
class Producer implements Runnable {

    private Queue q;

    public Producer(Queue q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

// Потребитель
class Consumer implements Runnable {

    private Queue q;

    public Consumer(Queue q) {
        this.q = q;
        new Thread(this, "Потребитель").start(); // Запускаем потоки
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

}

import java.util.ArrayList;

public class Main {
    // First level: Написать класс Counter, в котором есть одно целочисленное поле count (инициализировано нулем).
// В классе реализовать два метода add и sub. Первый метод увеличивает значение count
// на 1, второй - уменьшает на 1. Запустить два потока: в первом в цикле (можно 100 раз)
// вызвать метод add, во втором потоке столько же раз вызвать метод sub. В цикле, после каждой итерации,
// лучше поставить Thread.sleap, чтобы лучше смоделировать ситуацию. Добиться синхронизацией потоков, чтобы
// значение count после всех операций было равно 0. Пример, одного потока:
// Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                count.add();
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.add();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.sub();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();

        try {
            thread1.join(); // join нужен, чтобы обязательно потоки отработали до конца!
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount()); // Выведется только после того как потоки отработают до конца благодаря join!!!
    }
}

class Counter {
    private int count = 0;

    public synchronized void add() {
        count++;
    }

    public synchronized void sub() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
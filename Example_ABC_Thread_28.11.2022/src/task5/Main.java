package task5;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        int threadCount = 6; // количество потоков
        CountDownLatch cdl = new CountDownLatch(threadCount); // задаем значения счетчика
        System.out.println("Begin");
        for (int i = 0; i < threadCount; i++) {
            final int j = i;
            new Thread(() -> {
                try {
                    Thread.sleep(500 + (int) (500 * Math.random())); // считаем, что столько времени выполняется задача
                    cdl.countDown(); // как только задача выполнена, уменьшаем счетчик
                    System.out.println("Thread #" + j + " - ready");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        try {
            cdl.await(); // ждем пока счетчик не сбросится в нуль, пока это не произойдет, будем о
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}

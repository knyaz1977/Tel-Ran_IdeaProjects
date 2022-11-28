package task2_Monitor;
// Написать класс МФУ на котором возможны одновременная печать и
// сканирование документов, при этом нельзя одновременно печатать
// два документа или сканировать (при печати в консоль выводится
// сообщения "отпечатано 1, 2, 3,… страницы", при сканировании то же
// самое только "отсканировано…", вывод в консоль с периодом в 50 мс.)


public class Main {


    public static void main(String[] args) throws InterruptedException {

        Mfu mfu = new Mfu();
        Thread thread1 = new Thread(() -> mfu.print(5));
        Thread thread2 = new Thread(() -> mfu.scan(9));
        Thread thread3 = new Thread(() -> mfu.print(3));
        Thread thread4 = new Thread(() -> mfu.scan(1));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Mfu {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void print(int pages) {
        synchronized (mon1) {
            System.out.println("Ptint begin");
            for (int i = 0; i < pages; i++) {
                System.out.println("Printing " + (i + 1) + " page");
            }
            System.out.println("Print end");
        }
    }

    public void scan(int pages) {
        synchronized (mon2) {
            System.out.println("Scan begin");
            for (int i = 0; i < pages; i++) {
                System.out.println("Scaning " + (i + 1) + " page");
            }
            System.out.println("Scan end");
        }
    }
}

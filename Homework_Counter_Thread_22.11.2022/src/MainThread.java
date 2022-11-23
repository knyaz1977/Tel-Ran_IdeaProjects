// First level: Написать класс Counter, в котором есть одно целочисленное поле count (инициализировано нулем).
// В классе реализовать два метода add и sub. Первый метод увеличивает значение count
// на 1, второй - уменьшает на 1. Запустить два потока: в первом в цикле (можно 100 раз)
// вызвать метод add, во втором потоке столько же раз вызвать метод sub. В цикле, после каждой итерации,
// лучше поставить Thread.sleap, чтобы лучше смоделировать ситуацию. Добиться синхронизацией потоков, чтобы
// значение count после всех операций было равно 0. Пример, одного потока:
//Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                count.add();
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });

class AnotherThread extends Thread {
    Counter count = new Counter();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count.add();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        int aCount = count.getCount();
//        System.out.println("finalAddCount: " + aCount);
//        int result = sCount+aCount
//        System.out.println("addCount: " + count1.getCount());
    }

}

public class MainThread   //Класс с методом main()
{
    static AnotherThread another;    //Побочный поток

    public static void main(String[] args) {
        another = new AnotherThread();    //Создание побочного потока
        System.out.println("Потоки запущены");
        another.start();            //Запуск побочного потока
        Counter count = new Counter();
        for (int i = 0; i < 10; i++) {
            count.sub();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        int sCount = count.getCount();
//        System.out.println("subCount + addCount: " + count.getCount() );
//        System.out.println("finalSubCount: " + sCount);

    }
}

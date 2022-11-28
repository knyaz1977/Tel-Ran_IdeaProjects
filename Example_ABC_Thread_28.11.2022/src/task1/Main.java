package task1;

public class Main {
    // First level: 1. Создать три потока, каждый из которых выводит
    // определенную букву(A, B и C) 5 раз, порядок должен быть именно
    // ABСABСABС. Используйте wait/notify/notifyAll.
    private char currentletter = 'C';

    public static void main(String[] args) {
        Main m = new Main();
        Thread thread1 = new Thread(m::printA);
        Thread thread2 = new Thread(m::printB);
        Thread thread3 = new Thread(m::printC);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void printA() {
        try {
            for (int i = 0; i < 5; i++) {
                while (currentletter != 'C') {
                    wait();
                }
                System.out.print("A");
                currentletter = 'A';
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void printB() {
        try {
            for (int i = 0; i < 5; i++) {
                while (currentletter != 'A') {
                    wait();
                }
                System.out.print("B");
                currentletter = 'B';
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void printC() {
        try {
            for (int i = 0; i < 5; i++) {
                while (currentletter != 'B') {
                    wait();
                }
                System.out.print("C");
                currentletter = 'C';
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

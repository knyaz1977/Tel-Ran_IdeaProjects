public class Main {
    // First level: Написать программу, моделирующую работу порта.
    // Корабли могут заходить в порт для разгрузки / загрузки контейнеров.
    // Количество контейнеров, находящихся в текущий момент в порту и на корабле,
    // не должно превышать заданную грузоподъемность судна и емкость порта.
    // В порту работает несколько причалов.
    // В одном причале может стоять только один корабль.
    // Корабль может загружаться у причала, разгружаться или выполнять оба действия.
    //Нужны любые Ваши идеи. Можете даже менять условие задачи (упростить, например),
    // но модель многопоточной системы должна работать.
    public static void main(String[] args) {
        Main m = new Main();
        Thread thread1 = new Thread(m::boat1);
        Thread thread2 = new Thread(m::boat2);
        Thread thread3 = new Thread(m::boat3);
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
    private synchronized void boat1() {
        try {
            Dock(1, 7);
//            System.out.println("1-Корабль зашел в порт!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private synchronized void boat2() {
        try {
            Dock(2, 6);
//            System.out.println("2-Корабль зашел в порт!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private synchronized void boat3() {
        try {
            Dock(3, 5);
//            System.out.println("3-Корабль зашел в порт!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void Dock(int boat, int boatCapacity) {
        System.out.println(boat + "-Корабль зашел в порт!");
        Port port = new Port();
        Loading cl = new Loading(port, boatCapacity, boat);
        Unloading cul = new Unloading(port, boatCapacity, boat);
        new Thread(cl).start();
        new Thread(cul).start();
    }
}

// Класс Порт(с одним причалом) хранящий контейнеры
class Port {

    //    private int portCapacity = 10; // вместимость порта 10 контейнеров
    private int container = 0;

    public synchronized void containersUnloading(int boatCapacity, int boat) {
        while (container < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        container--;
        System.out.println("Погрузили 1 контейнер на " + boat + "-корабль");
        System.out.println("Контейнеров в порту: " + container + " c " + boat + "-корабля");
        notify();
    }

    public synchronized void containersLoading(int boatCapacity, int boat) {
        while (container >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        container++;
        System.out.println("Выгрузили 1 контейнер в порту c " + boat + "-корабля");
        System.out.println("Контейнеров в порту: " + container + " c " + boat + "-корабля");
        notify();
    }
}

// Класс Погрузка
class Loading implements Runnable {

    Port port;
    int boatCapacity;
    int boat;

    public Loading(Port port, int boatCapacity, int boat) {
        this.port = port;
        this.boatCapacity = boatCapacity;
        this.boat = boat;

    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            port.containersLoading(boatCapacity, boat);
        }
    }
}

// Класс Разгрузка
class Unloading implements Runnable {

    Port port;
    int boatCapacity;
    int boat;

    public Unloading(Port port, int boatCapacity, int boat) {
        this.port = port;
        this.boatCapacity = boatCapacity;
        this.boat = boat;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            port.containersUnloading(boatCapacity, boat);
        }
    }
}
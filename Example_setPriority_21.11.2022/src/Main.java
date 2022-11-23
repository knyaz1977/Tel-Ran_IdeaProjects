public class Main {

    public static void main(String[] args) {
        CallMe target = new CallMe();
//        target.wait();//
//        target.notify(); //возобновит
        Caller caller1 = new Caller(target, "Добро пожаловать", 10);
        Caller caller2 = new Caller(target, "в cинхронизированный", 5);
        Caller caller3 = new Caller(target, "метод", 1);
        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class CallMe {
    public void call(String msg) { //   public synchronized(для запуска только одного потока, пока он не отработает) void call(String msg)
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {

    private final String msg;
    private final CallMe target;
    Thread t;

    public Caller(CallMe target, String msg, int priority) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.setPriority(priority);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
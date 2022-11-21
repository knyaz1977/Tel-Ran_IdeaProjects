import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        new MyThread("Have ");
        new MyThread("a nice ");
        new MyThread("day! \n"); // \n
    }
}
class MyThread implements Runnable {

    private String text;
    private Thread thread;

    public MyThread(String text) {
        this.text = text;
        thread = new Thread(this, text);
//        System.out.println("New thread: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        //
        for (int i = 0; i < 10; i++) {
            myWriter(text);
//            System.out.println(text + ": " + i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
//                System.out.println(text + "interrupted");
            }
        }
//        System.out.println(text + " finish");
    }
    public static void myWriter(String text) {
        try (FileWriter writer = new FileWriter("C:/Users/Dmitry/Desktop/Test_Java/3.txt", true)) {
            // Запись строки в файл
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

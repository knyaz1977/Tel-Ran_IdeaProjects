package task3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Reader Reader
        try (FileReader reader = new FileReader("C:/Users/Dmitry/Desktop/Test_Java/1.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        // 2. Чтение через буфер
        try (FileReader reader = new FileReader("C:/Users/Dmitry/Desktop/Test_Java/1.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c); // Эта строка обрезает буфер до "с"!
                }
                System.out.println(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

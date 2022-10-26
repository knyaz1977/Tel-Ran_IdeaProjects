package task2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Reader Writer
        try (FileWriter writer = new FileWriter("C:/Users/Dmitry/Desktop/Test_Java/1.txt", true)) {
            String text = "Hello, Java!";
            writer.write(text);

            // Запись по символам
            writer.append("!");


            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // First level: 1. Напишите метод fileCopy, который принимает
        // на вход два имени файлов: file1 и file2.
        // Метод должен сделать копию содержимого файла file1
        // в файл file2. Примечание: file1 обязательно существует
        // на диске.
        FileInputStream file1 = new FileInputStream("C:/Users/Dmitry/Desktop/Test_Java/1.txt");
        FileOutputStream file2 = new FileOutputStream("C:/Users/Dmitry/Desktop/Test_Java/2.txt", true);// true - данные дозаписываются в конец файла,
        // а при false - файл полностью перезаписывается
        fileCopy(file1, file2);

    }

    private static void fileCopy(FileInputStream file1, FileOutputStream file2) throws IOException {
        byte[] buffer = new byte[file1.available()];
        file1.read(buffer);
        for (int i = 0; i < buffer.length; i++) {
            file2.write((char) buffer[i]);
        }
        file1.close();
        file2.close();
    }


}




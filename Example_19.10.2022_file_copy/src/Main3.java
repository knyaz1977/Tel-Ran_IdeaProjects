import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) {
        try {
            printFileSize2("C:\\Users\\Dmitry\\Desktop\\5.txt"); // указываем не существующий файл
        } catch (Exception e) { // catch - отловить
            // отправка email
            System.out.println(e.getMessage());
            ;
            e.printStackTrace(); // Выводит информацию об ошибке!
        }
//        printFileSize("C:\\Users\\Dmitry\\Desktop\\5.txt"); // не отработает, вылетит ошибка/ Отсутствует throws IOException у main

//        if (что-то проверяем) {
//            throw  new MyException()
//        }
    }

//    public static void main(String[] args) throws IOException {
//        rintFileSize("C:\\Users\\Dmitry\\Desktop\\5.txt");
//    }

    private static void printFileSize(String fileName) throws IOException { // делаем метод без обработки исключений. FileNotFoundException - можно не прописывать включен в OException
        FileInputStream fis = new FileInputStream(fileName);
        System.out.println(fis.available());
        fis.close();
    }

    private static void printFileSize2(String fileName) throws Exception { // делаем метод без обработки исключений. FileNotFoundException - можно не прописывать включен в OException
        File file = new File(fileName);
        if (!file.exists()) {
            // Что здесь делать? "Бросить" - сгенерировать исключение
            throw new FileNotFoundException("Our proper message");
        }
        FileInputStream fis = new FileInputStream(fileName);
        System.out.println(fis.available());
        fis.close();
    }
}
// Класс для проверки ошибок
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

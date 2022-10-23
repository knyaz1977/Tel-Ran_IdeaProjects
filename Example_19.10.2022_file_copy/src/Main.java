import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // try{}catch() - нужен для проверки на ошибку
        try { // try - блок
            FileInputStream fis = new FileInputStream("C:\\Users\\Dmitry\\Desktop\\5.txt"); // указываем не существующий файл
            System.out.println(fis.available()); // выводит количество байтов в файле
            fis.close();
        } catch (ArithmeticException e ) { // catch - отловить
            System.out.println("Error: " + e.getMessage()); // getMessage() - это сообщение об ошибке!
        } catch (FileNotFoundException e) { // В скобках указываем на какую ошибку мы проверяем.
//            e.printStackTrace(); // printStackTrace()
//            e.getMessage(); // getMessage() - это сообщение об ошибке!
            System.out.println("Error: File not found!");
//            System.out.println("Error:" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace(); //
        }
        System.out.println("Message after working with file");
    }
}


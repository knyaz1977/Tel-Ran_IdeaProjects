import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // try{}catch() - нужен для проверки на ошибку
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Dmitry\\Desktop\\1.txt");
            System.out.println(fis.available());
            fis.close();
        } catch (ArithmeticException e ) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileNotFoundException e) { // В скобках указываем на какую ошибку мы проверяем.
//            e.printStackTrace();
//            System.out.println("Error: File not found!");
            System.out.println("Error:" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace(); //
        }
        System.out.println("Message after working with file");
    }
}


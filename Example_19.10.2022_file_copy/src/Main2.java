import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        // try{}catch() - нужен для проверки на ошибку
        try {
            // fis сокращение от FileInputStream
            FileInputStream fis = new FileInputStream("C:\\Users\\Dmitry\\Desktop\\1.txt");
            System.out.println(fis.available());
            fis.close();
            // далее идут арифметические вычисления над считанными данными
        } catch (FileNotFoundException fnfe) { // В скобках указываем на какую ошибку мы проверяем.
            fnfe.getMessage(); // можно применять различные методы к fnfe.
            System.out.println("Error: message2");
        } catch (IOException ioe) {
            System.out.println("Error: message1");
        } catch (Exception e) { // Exception ставят в конце, всегда сработает
            System.out.println("Error: message3");
        } finally {
            // Этот блок кода срабатывает и когда возникает исключение, и когда не возникает
            System.out.println("Message in finale-block");
        }
        System.out.println("Message after working with file");


        // catch (Exception e) Используют один!
//        try {
//            // здесь что-то делается
//        } catch (Exception e) {
//            e.printStackTrace(); // ?????????
//        }
    }
}



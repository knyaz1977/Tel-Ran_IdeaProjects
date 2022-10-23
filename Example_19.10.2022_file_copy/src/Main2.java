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
            // предположим, что далее идут арифметические вычисления над считанными данными
        } catch (FileNotFoundException fnfe) { // В скобках указываем на какую ошибку мы проверяем.
            fnfe.getMessage(); // можно применять различные методы к fnfe.
            System.out.println("Error: message1");
        } catch (IOException ioe) {
            System.out.println("Error: message2");
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
//            e.printStackTrace(); //
//        printStackTrace - это метод класса Throwable.
//        Этот метод выводит в консоль сообщение об ошибке;
//        где мы получаем исключение в исходном коде.
//        Эти методы можно использовать с блоком catch
//        и в них описываются:
//
//        Имя исключения.
//        Описание исключения.
//        Место расположения исключения в исходном коде.
//        Три метода, которые описывают исключение на консоли
//        (в которых printStackTrace - один из них) это:
//
//        - printStackTrace()
//        - toString()
//        - getMessage()
//        }
    }
}



import java.io.FileInputStream;

public class TryCatch {

    public static void main(String[] args) {
        // try with resources - сам закроет поток.
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Dmitry\\Desktop\\1.txt")){
            System.out.println(fis.available());
            // fis.close(); // строчка стала не нужна благодаря записи try with resources.
            // В скобках указывают ресурсыю
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
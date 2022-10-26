package task4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // BufferedReader и BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Dmitry/Desktop/Test_Java/1.txt"))) {
                                                // FileWriter - по умолчанию ("", false), поэтому перезаписывает,
                                                // если добавить после "," true, дозапишет
            String text = "Hello Java! \nExample of text\n";
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        // Чтение посимвольное
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Dmitry/Desktop/Test_Java/1.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
//            while ( (br.ready()) {
//                int c = br.read();
//                System.out.println((char) c);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение посимвольное
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Dmitry/Desktop/Test_Java/1.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
//            while ( (br.ready()) {
//                int c = br.read();
//                System.out.println((char) c);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

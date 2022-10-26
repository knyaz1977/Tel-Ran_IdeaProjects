package task5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // InputStreamReader - переводит байты в значения(char)
//        System.out.println("Input string");
//        String str = reader.readLine();

        // Для тестирования можно раскомментировать!
//        while (true) {
//            int x = System.in.read(); // System.in - считывает байты!
//            System.out.println(x);
//        }

        InputStreamReader isr = new InputStreamReader(System.in);
        int x = isr.read();
        System.out.println((char) x);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
    }
}

package task1;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        // Подготовка файла
        byte[] array = {1, 2, 3, 4, 5, 4, 5, 9};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            baos.write(array);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Выполнение задания
        try (FileInputStream fis = new FileInputStream("C:/Users/Dmitry/Desktop/Test_Java/1.txt")) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            Map<Byte, Integer> map = new HashMap<>();
            for (int i = 0; i < buffer.length; i++) {
                if (map.containsKey(buffer[i])) {
                    map.put(buffer[i], map.get(buffer[i]) + 1);
                } else {
                    map.put(buffer[i], 1);
                }
            }
            int maxValue = map.values().stream()
                    .max(Integer::compareTo).orElse(0);
            for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxValue) {
                    System.out.print(entry.getValue() + ", "+ entry.getKey());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

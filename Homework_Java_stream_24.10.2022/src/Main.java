import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    // str = "C:/Users/Dmitry/Desktop/Test_Java/1.txt"
    public static void main(String[] args) throws IOException {
        // First level: Ввести с консоли имя файла.
        // Найти байт или байты с максимальным количеством повторов.
        // Вывести их на экран через пробел.
        // Закрыть поток ввода-вывода.

        System.out.println("Input the file name");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        FileInputStream file1 = new FileInputStream(str);

        List<Character> chars = new ArrayList<>();

        byte[] buffer = new byte[file1.available()];
        file1.read(buffer);
        for (int i = 0; i < buffer.length; i++) { // Если нужно поработать с buffer. Например: изменить добавляемый файл.
            chars.add((char) buffer[i]);
        }
        System.out.println(chars);
        file1.close();

        Map<Character, Integer> stat = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                // должен возвращать число < 0 (return < 0), если o1 должен стоять раньше о2
                // должен возвращать число > 0 (return > 0), если o1 должен стоять позже о2
                // должен возвращать число = 0 (return = 0)
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < chars.size(); i++) {
            char c = chars.get(i);
            if (stat.containsKey(c)) {
                stat.put(c, stat.get(c) + 1);
            } else {
                stat.put(c, 1);
            }

        }

        int maxValueInMap = (Collections.max(stat.values()));  // вернет максимальное значение в Hashmap
        for (Map.Entry<Character, Integer> entry : stat.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey() + ": " + entry.getValue());     // выводим ключ/и(key) с максимальным значением!
            }
        }
    }
}

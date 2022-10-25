package task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Сериализация и Десериализация
        // ObjectOutputStream и ObjectInputStream

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            Person p = new Person("Jack", 45, 12.3, true);
            oos.writeObject(p);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Dmitry//person.txt"))) {
            Person p = (Person)ois.readObject();
            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
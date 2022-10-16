import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // First level: Дан файл действительных чисел и два числа a и b.
        // Используя очередь (несколько очередей) напечатать сначала все элементы,
        // меньшие a; потом все элементы из отрезка [a, b]; потом все элементы, большие b.
        int[] data = new int[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (100 * Math.random());
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        // Начинает работать алгоритм
        int a = 45;
        int b = 65;

        ArrayList<Integer> queueArrayList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < a) {
                System.out.print(data[i] + " ");
            } else {
                queueArrayList.add(data[i]);
            }
        }
        System.out.println();

        Queue queue1 = new Queue();
        for (int j = 0; j < queueArrayList.size(); j++) {
            if (queueArrayList.get(j) <= b) {
                System.out.print(queueArrayList.get(j) + " ");
            } else {
                queue1.add(queueArrayList.get(j));
            }
        }
        System.out.println();
        while (!queue1.isEmpty()) {
            System.out.print(queue1.delete() + " ");
        }
    }
}




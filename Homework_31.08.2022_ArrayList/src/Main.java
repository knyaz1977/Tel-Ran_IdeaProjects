import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Задача состоит в том, чтобы удалить повторяющиеся элементы в ArrayList.
        //
        //Примеры:
        //
        //Input: ArrayList = [1, 2, 2, 3, 4, 4, 4]
        //Output: [1, 2, 3, 4]
        //
        //Input: ArrayList = [12, 23, 23, 34, 45, 45, 45, 45, 57, 67, 89]
        //Output: [12, 23, 34, 45, 57, 67, 89]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ArrayList size");
        int n = scanner.nextInt();

        ArrayList<ArrList> arrayLists = new ArrayList<>(n);
        System.out.println("Input ArrayList");
        for (int i = 0; i < n; i++) {
            arrayLists.add(new ArrList(scanner.nextInt()));
        }
        System.out.println(arrayLists);
        for (int j = 1; j < arrayLists.size(); ) {
            int temp1 = arrayLists.get(j).getNumber();
            int temp2 = arrayLists.get(j - 1).getNumber();
            if (temp1 == temp2) {
                arrayLists.remove(j);
                continue;
            }
            j++;
        }
        System.out.println(arrayLists);
    }
}

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    //Второй уровень: Учитывая два целочисленных массива nums1 и nums2,
    //верните массив их пересечения. Каждый элемент в результате
    //должен появляться столько раз, сколько он отображается в обоих
    //массивах, и вы можете возвращать результат в любом порядке.
    //Пример 1:
    //Входные данные: числа 1 = [1,2,2,1], число 2 = [2,2]
    //Результат: [2,2]
    //Пример 2:
    //Входные данные: числа 1 = [4,9,5], числа 2 = [9,4,9,8,4]
    //Результат: [4,9]
    //Пояснение: [9,4] также принимается.
    public static void main(String[] args) {
//        int[] num1 = new int[]{1, 2, 2, 1};
//        int[] num2 = new int[]{2, 2};

//        int[] num1 = new int[]{4, 9, 5};
//        int[] num2 = new int[]{9, 4, 9, 8, 4};

//        ArrayList<Integer> num2 = new ArrayList<>(List.of(9, 4, 9, 8, 4));
//        ArrayList<Integer> num1 = new ArrayList<>(List.of(4, 9, 5));

        ArrayList<Integer> num2 = new ArrayList<>(List.of(1, 2, 2, 1));
        ArrayList<Integer> num1 = new ArrayList<>(List.of(2, 2));

        System.out.println(num1);
        System.out.println(num2);
        ArrayList<Integer> num3 = new ArrayList<>();
        for (int i = 0; i < num1.size(); i++) {
            for (int j = 0; j < num2.size(); j++) {
                if (num1.get(i) == num2.get(j)) {
                    num3.add(num1.get(i));
                    num1.remove(i);
                    num2.remove(j);
                    i = 0;
                    j = 0;
                }
                if (num1.size() == 0) {
                    break;
                }
            }
        }
        System.out.println(num3);
    }
}

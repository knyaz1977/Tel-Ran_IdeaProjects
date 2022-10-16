import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    //    //Первый уровень: У вас есть набор целых чисел s, который изначально содержит все числа от 1 до n. К сожалению, из-за какой-то ошибки одно из чисел в s было продублировано на другое число в наборе, что приводит к повторению одного числа и потере другого числа.
//    //Вам выдается целочисленный массив nums, представляющий состояние данных этого набора после ошибки.
//    //Найдите число, которое встречается дважды, и число, которое отсутствует, и верните их в виде массива.
//    //Пример 1:
//    //Входные данные: nums = [1,2,2,4]
//    //Результат: [2,3]
//    //Пример 2:
//    //Входные данные: nums = [1,1]
//    //Результат: [1,2]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 3, 4, 2, 6, 7})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
        System.out.println();
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 2, 3, 4, 2, 6, 7})));
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 1})));
    }

    // Метод грубой силы (brute force)
    private static int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
            if (dup > 0 && missing > 0) {
                break;
            }
        }
        return new int[]{dup, missing};// даем изначально значениям которые мы ищем значения -1
    }

    // Используя map
    private static int[] findErrorNums2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dup = -1, missing = -1;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1); // getOrDefault возвращает значение по ключу n, иначе
        }
        for (int i = 0; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    dup = i;
                }
            } else {
                missing = i;
            }
        }
        return new int[]{dup, missing};
    }
}

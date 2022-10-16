import java.util.Arrays;

public class Main {
    //Первый уровень: У вас есть набор целых чисел s, который изначально содержит все числа от 1 до n. К сожалению, из-за какой-то ошибки одно из чисел в s было продублировано на другое число в наборе, что приводит к повторению одного числа и потере другого числа.
    //Вам выдается целочисленный массив nums, представляющий состояние данных этого набора после ошибки.
    //Найдите число, которое встречается дважды, и число, которое отсутствует, и верните их в виде массива.
    //Пример 1:
    //Входные данные: nums = [1,2,2,4]
    //Результат: [2,3]
    //Пример 2:
    //Входные данные: nums = [1,1]
    //Результат: [1,2]
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        int[] nums2 = {1, 1};
        int[] nums3 = {1, 2, 3, 4, 2, 6, 7};
        System.out.println(Arrays.toString(nums1));
        result(nums1);
        System.out.println();
        System.out.println(Arrays.toString(nums2));
        result(nums2);
        System.out.println(Arrays.toString(nums3));
        result(nums3);
    }

    private static void result(int[] nums) {
        int[] nums2 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                int j = 0;
                nums2[j] = nums[i];
                nums2[j + 1] = nums[i] + 1;
                System.out.println(Arrays.toString(nums2));
                break;
            }
        }
    }
}

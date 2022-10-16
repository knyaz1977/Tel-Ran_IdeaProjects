import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        // Вам дается большое целое число, представленное в виде целого массива цифр,
        // где каждая цифра [i] является i-й цифрой целого числа. Цифры упорядочены
        // от наиболее значимых к наименее значимым в порядке слева направо.
        // Большое целое число не содержит никаких начальных 0.
        // Увеличьте большое целое число на единицу и верните результирующий массив цифр.

        // Input: digits = [1,2,3]
        // Output: [1,2,4]
        // Explanation: The array represents the integer 123.
        // Incrementing by one gives 123 + 1 = 124.
        // Thus, the result should be [1,2,4].

        // Input: digits = [9]
        // Output: [1,0]
        // Explanation: The array represents the integer 9.
        // Incrementing by one gives 9 + 1 = 10.
        // Thus, the result should be [1,0].

        int[] digits = {1, 9};
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            System.out.println(Arrays.toString(array));
            return;
        }
        System.out.println(Arrays.toString(digits));
    }
}
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 3, 4, 2, 6, 7})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }
    private static int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                dup = nums[i];
                missing = i + 1;
                break;
            }
        }
        return new int[]{dup, missing};
    }

}



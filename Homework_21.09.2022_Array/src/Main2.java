import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        int[] nums3 = {1, 2, 3, 4, 2, 6, 7};
        System.out.println(Arrays.toString(nums3));

        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int j = 0; j < nums3.length; j++) {
            myHashMap.put(nums3[j], j);
        }
        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet())
            if (entry.getKey() != entry.getKey() + 1) {
                System.out.println("Символ пробел/space вcтречаетcя " + item.getValue() + " раз");
            } else {

                System.out.println("Символ " + item.getKey() + " вcтречаетcя " + item.getValue());
            }
        System.out.println(entry.getKey() + " " + entry.getValue());


//        result(myHashMap);

//    private static void result(int[] nums) {
//        int[] nums2 = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == nums[i + 1]) {
//                int j = 0;
//                nums2[j] = nums[i];
//                nums2[j + 1] = nums[i] + 1;
//                System.out.println(Arrays.toString(nums2));
//                break;
//            }
//        }
    }
}

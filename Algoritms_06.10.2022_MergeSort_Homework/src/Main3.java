import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {
    // // *String[] a = {"1,2-4", "3-6", "2,5,7-11", "5"} -> Integer[] i = {1,2,3,4,3,4,5,6,2,5,7,8,9,10,11,5}
    public static void main(String[] args) {
       String[] a = {"1,2-4", "3-6", "2,5,7-11", "5"};
        System.out.println(Arrays.toString(a));
        itemArray(a);
        Integer b = null;
        for (int i = 0; i < a.length; i++) {
            if (b == Integer.valueOf(String.valueOf(a))) {

            }
        }



    }

    private static void itemArray(String[] a) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            arrayList.add(a[i]);

        }
        System.out.println(arrayList);
    }


}

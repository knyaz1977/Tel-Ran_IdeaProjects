import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // *String[] a = {"1,2-4", "3-6", "2,5,7-11", "5"} -> Integer[] i = {1,2,3,4,3,4,5,6,2,5,7,8,9,10,11,5}
        String[] a = {"1,2-4", "3-6", "2,5,7-9", "5"};
        System.out.println(Arrays.toString(a));
        ArrayList<Character> arrayList = new ArrayList<>();
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        Character[] chars = arrayList.toArray(new Character[0]);//////////////////////////////////////
        for (int i = 0; i < a.length; i++) {
            String str = a[i];
            char[] chars = str.toCharArray();
            System.out.println(Arrays.toString(chars));
            for (int j = 0; j < chars.length; j++) {
//                arrayList.removeAll();/////////////////////////////////
                if (chars[j] == ',') {
                    continue;
                } else if (chars[j] == '-') {
                    int n = chars[j + 1] - chars[j - 1];
                    int v = chars[j - 1] - '0';
                    for (int k = 0; k < n-1; k++) {
//                        int[] num = new int[chars.length];
////                        num[0] = chars[j - 1] - '0';

                        arrayList.add((char) (v+1));

//                        for (int l = 0; l < chars.length; l++) {
//                            num[l] = v + 1;
////                            num[j] = (int)chars[j];
//                            int s = num[l];
//                        }
//                        integerArrayList.add(chars[j-1]);



//                        arrayList.remove(j - 1);
//                        num[j] = (int) chars[j];

//                        arrayList.add(s);
                    }
                } else {
                    arrayList.add(chars[j]);
                }
            }

        }
        System.out.println();
//        System.out.println(Arrays.toString(chars));
        System.out.println(arrayList);
//        String[] str = arrayList.stream().toArray(String[]::new);
//        System.out.println(Arrays.toString(str));
//        char[] chars = str.


    }
}

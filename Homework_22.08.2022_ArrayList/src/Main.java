import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //First level: Даны два ArrayList, представляющих два неотрицательных целых числа. Цифры,
// составляющие эти числа, хранятся по отдельности в ArrayList. Например,
//ArrayList a = new ArrayList<>();
//a.add(2);
//a.add(4);
//a.add(3);
//представляет трехзначное число 243.
//Написать программу, которая складывает два числа, заданных подобным образом и получает ответ в виде нового ArrayList.
    public static void main(String[] args) {
        ArrayList<IntegerNumber> a = new ArrayList<>();
        a.add(new IntegerNumber(2));
        a.add(new IntegerNumber(4));
        a.add(new IntegerNumber(3));
        int s1 = k(a);

        System.out.println();

        ArrayList<IntegerNumber> a1 = new ArrayList<>();
        a1.add(new IntegerNumber(4));
        a1.add(new IntegerNumber(5));
        a1.add(new IntegerNumber(6));
        a1.add(new IntegerNumber(2));

        int s2 = k(a1);
        int s3 = s1 + s2;
        System.out.println();
        System.out.println(s3);
        System.out.println();

        int x = s3;
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x /= 10;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(getArrayList2(s3));


    }

    private static int k(ArrayList<IntegerNumber> a) {
        int k = 1;
        int s = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            s = s + a.get(i).getNumber() * k;
            k = k * 10;
        }

        System.out.println(s);
        return s;
    }
    private static ArrayList<Integer> getArrayList2(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        while (n > 0) {
            answer.add(0, n % 10);
            n = n / 10;
        }
        return answer;
    }
}

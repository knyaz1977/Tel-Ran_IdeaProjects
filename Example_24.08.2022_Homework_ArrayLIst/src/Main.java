import javax.print.DocFlavor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//First level: Даны два ArrayList, представляющих два неотрицательных целых числа. Цифры,
// составляющие эти числа, хранятся по отдельности в ArrayList. Например,
//ArrayList a = new ArrayList<>();
//a.add(2);
//a.add(4);
//a.add();
//представляет трехзначное число 243.
//Написать программу, которая складывает два числа, заданных подобным образом и получает ответ в виде нового ArrayList.
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(7);
        b.add(7);
        b.add(4);

        int number = getNumber(a);
        System.out.println(number);
        System.out.println(getArrayList(number));
        System.out.println(getNumber2(b));

        // Решение
        int number1 = getNumber(a);
        int number2 = getNumber2(b);
        int answer = number1 + number2;
        System.out.println(getArrayList(answer));

        // Решение с помощью улучшенного алгоритма
        System.out.println(sum(a, b));

        System.out.println(getArrayList2(123));
    }

    private static ArrayList<Integer> sum(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int remainder = 0; //
        int i = a.size() - 1, j = b.size() - 1;
        while (i >=0 || j >= 0) {
            int value1 = 0;
            if (i >= 0) {
                value1 = a.get(i);
                i--;
            }
            int value2 = 0;
            if (j >= 0) {
                value2 = b.get(j);
                j--;
            }
            result.add(0, (value1 + value2 + remainder) % 10); // записываем остаток
            remainder = (value1 + value2 + remainder) / 10; // remainder - запоминаем число переноса

        }
        if (remainder > 0) {
            result.add(0, remainder);
        }
        return result;
    }

    //  Реализуем алгоритм получения числа по разрядам, х
    //  ранящим в ArrayLIst
    private static int getNumber(ArrayList<Integer> a) {
        String str = "";
        for (int i = 0; i < a.size(); i++) {
            str = str + a.get(i); // приклеиваем к строке значение по индексу
        }
        // "243
        return Integer.parseInt(str);// Преобразует СТРОКУ в Целое число
    }

    private static int getNumber2(ArrayList<Integer> a) {
        int answer = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            answer = answer + a.get(i) * (int) Math.pow(10, a.size() - i - 1);
        }
        return answer;
    }

    private static ArrayList<Integer> getArrayList(int n) {// разбили строку на разряды
        ArrayList<Integer> answer = new ArrayList<>();
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {

            // '7' -> "7" -> 7
            answer.add(Integer.parseInt("" + str.charAt(i)));// Преобразует СТРОКУ в Целое число
//            str.charAt(i);
        }
        return answer;
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

// get(i) // a.get(i) где a, название ArrayList-a.
// indexOf(i)
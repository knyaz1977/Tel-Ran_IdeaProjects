package task3;

public class Main3 {

    public static String reverse(int x) {
        String s = x + "";
        StringBuilder stringBuilder = new StringBuilder(s);
        while (stringBuilder.charAt(stringBuilder.length() - 1) == '0') {
//            if (stringBuilder.charAt(stringBuilder.length() - 1) == '0') {
//            stringBuilder = stringBuilder.deleteCharAt(s.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        stringBuilder.reverse();
        String e = "-";
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '-') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            e = e + stringBuilder;
            return e;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int a = 123;
        int b = -255;
        int c = 120;
        int d = -1500;

        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
        System.out.println(reverse(d));
    }
}

public class Main2 {

    public static void main(String[] args) {
        // Имеется строка. Вывести ее в обратном порядке
        // Hello -> olleH

        reversString("Hello");
        System.out.println();
        reversString1("Hello");
    }

    private static void reversString(String s) {
        for (int i = s.length() - 1; i >= 0; i--) { // длина строки // от последнего знака к первому
            System.out.print(s.charAt(i));
        }
    }

    private static void reversString1(String s1) {
        for (int i = 0; i < s1.length(); i++) { // длина строки // от первого знака к последнему
            System.out.print(s1.charAt(i));
        }
    }


}





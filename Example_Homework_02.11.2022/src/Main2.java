import java.util.Locale;

public class Main2 {

    public static void main(String[] args) {
        // "Hello, Java" - литерал
        String str = "Hello, Java"; // Создание объекта с помощью строкового литерал.
        str.toLowerCase();// Т.к. str - это ссылка, то при выводе ->
        System.out.println(str);// -> просто str регистр не поменяется!
        System.out.println(str.toLowerCase()); // Создается новый объект,
        // но ни куда не сохраняемый, поэтому у него меняется регистр.

        A a = new A();
        System.out.println(a.getI());
        a.mult(2);
        System.out.println(a.getI());

        String s = new String("Hello");

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);
        System.out.println(s2);

        // Интернирование строк
        // куча (heap)
        // пул строк (string poll)



    }
}

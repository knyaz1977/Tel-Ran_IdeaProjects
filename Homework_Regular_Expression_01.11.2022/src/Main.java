import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //1. Написать регулярное выражение, определяющее является
        // ли данная строчка шестнадцатиричным идентификатором цвета в HTML.
        // Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и т.д.
        //– пример правильных выражений: #FFFFFF, #FF3421, #00ff00.
        //– пример неправильных выражений: 232323, , #fd2.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the color ID");
        String str = scanner.next();

        System.out.println(str.matches("^#[a-fA-F0-9]{6}$"));

        //2. Проверить, надежно ли составлен пароль. Пароль считается надежным,
        // если он состоит из 8 или более символов.
        // Где символом может быть английская буква, цифра и знак подчеркивания.
        //– пример правильных выражений: C00l_Pass, SupperPas1.
        //– пример неправильных выражений: C00l.

        System.out.println("Input the password");
        String str1 = scanner.next();

        System.out.println(str1.matches("^[a-zA-Z0-9_]{8,256}$"));
    }
}

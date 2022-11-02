public class Main {

    public static void main(String[] args) {
        //1. Написать регулярное выражение, определяющее является
        // ли данная строчка шестнадцатиричным идентификатором цвета в HTML.
        // Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и т.д.
        //– пример правильных выражений: #FFFFFF, #FF3421, #00ff00.
        //– пример неправильных выражений: 232323, , #fd2.

        String regExp = "^#[0-9A-Fa-f]{6}$";
        System.out.println("#FFFFFF".matches(regExp));
        System.out.println("#FF3421".matches(regExp));
        System.out.println("#00ff00".matches(regExp));
        System.out.println("232323".matches(regExp));
        System.out.println("f#fddee".matches(regExp));
        System.out.println("#fd2".matches(regExp));

        //2. Проверить, надежно ли составлен пароль. Пароль считается надежным,
        // если он состоит из 8 или более символов.
        // Где символом может быть английская буква, цифра и знак подчеркивания.
        //– пример правильных выражений: C00l_Pass, SupperPas1.
        //– пример неправильных выражений: C00l.
        System.out.println();
        String regExp2 = "[A-Za-z0-9_]{8,}";
        System.out.println("C00l_Pass".matches(regExp2));
        System.out.println("SupperPas1".matches(regExp2));
        System.out.println("C00l_Pass".matches(regExp2));
        System.out.println("C00l".matches(regExp2));



    }
}

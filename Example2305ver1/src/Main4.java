import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;
import java.util.Locale;

public class Main4 {
    public static void main(String[] args) {
        String str  = "Hello, java!";
        System.out.println(str);

        System.out.println(str.length()); // Длина строки
        System.out.println(str.charAt(4)); // Символ с позиции (4)
        System.out.println(str.substring(7)); // Подстрока, начиная с указанного(7) индекса до конца строки

        System.out.println(str.substring(7, 11)); // Подстрока, начиная с первого индекса(7) до второго не включая последний индекс(11)

        System.out.println(str.toLowerCase()); // Перевод всех букв строки в нижний регистр
        System.out.println(str.toUpperCase()); // Перевод всех букв строки в верхний регистр



    }
}

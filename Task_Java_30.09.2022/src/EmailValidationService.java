import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

public class EmailValidationService {
    private final GmailService gmailService = new GmailService();
    private final YandexService yandexService = new YandexService();

//    private final  static Map<String, Predicate<String>>





    public boolean validate(String email) {
        String trimmedStr = email.trim().toLowerCase(Locale.ROOT);
        if(trimmedStr.endsWith("gmail.com")) {
            return gmailService.validate(email);
        } else if(trimmedStr.endsWith("yandex.com")) {
            return yandexService.validate(email);
        } else {
            return email.contains("@");
        }
    }

    public static void main(String[] args) {
        String email = "slava@gMaIl.com ".trim().toLowerCase(Locale.ROOT);
        System.out.println(email.endsWith("gmail.com"));
    }
}

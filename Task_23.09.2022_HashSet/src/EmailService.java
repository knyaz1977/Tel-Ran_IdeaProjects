import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmailService {
//private  Map<String, Map<String, Adress>> map = new HashMap<>();
    private Map<String, Integer> sendedEmails = new HashMap<>();
//    private Map<String, Integer> sendedEmails = new HashSet<>();
//    private Set<String> sendedEmails = new HashSet<>();

    public void sendEmail(String email, String emailBody) {
        if(!sendedEmails.containsKey(email)) {
            System.out.println(email + " : " + emailBody);
//            sendedEmails.add(email);
            sendedEmails.put(email, 1);
        }
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();

        emailService.sendEmail("test@gmail.com", "Hi!");
        emailService.sendEmail("test11@gmail.com", "Hi!");
        emailService.sendEmail("test@gmail.com", "Hi!");
        emailService.sendEmail("test11@gmail.com", "Hi!");
    }
}

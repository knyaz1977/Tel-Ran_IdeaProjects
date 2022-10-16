import java.util.Comparator;

public class MessageComparartor implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
         return o1.getText().compareTo(o2.getText());
    }
}

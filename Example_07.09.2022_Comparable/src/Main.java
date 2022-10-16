import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Ann");
        Person person3 = new Person("Victor");
        Person person4 = new Person("Anton");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);

        System.out.println(person1.compareTo(person2));

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Victor");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        MessageComparartor mc = new MessageComparartor();
        ArrayList<Message> messages = new ArrayList<>();
        messages.add(new Message("b"));
        messages.add(new Message("a"));
        messages.add(new Message("z"));
        messages.add(new Message("d"));
        System.out.println(messages);
        Collections.sort(messages, mc);
        System.out.println(messages);

        Collections.sort(messages, new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o1.getText().compareTo(o2.getText());
            }
        });
    }
}

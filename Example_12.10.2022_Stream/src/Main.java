import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        Collections.addAll(phones, new Phone("phone1", 55000),
                new Phone("phone2", 50000),
                new Phone("phone5", 45000),
                new Phone("phone4", 60000),
                new Phone("phone3", 5000)
        );
        phones.stream()
                .filter(p -> p.getPrice() < 60000)
                .sorted(Comparator.comparingInt(Phone::getPrice)
                        .thenComparing(Phone::getName))
//              .sorted(Comparator.comparingInt(Phone::getPrice).reversed()) // замена записи ниже.
                // reversed() - Вывод в обратном порядкею
//              .sorted(new Comparator<Phone>() {
//                  @Override
//                  public int compare(Phone o1, Phone o2) {
//                      return 0;
//                  }
//              })
                .forEach(p -> System.out.println(p.getName() + " " + p.getPrice()));

        {

        }
    }
}

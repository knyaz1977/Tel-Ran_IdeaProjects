import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Есть два класса: Address с полями street and houseNumber и Person
        // с полями name and address.
        // Нужно написать метод
        // List<Address> getAddresses (List<Person>persons)
        // То есть по списку person(List<Person>persons) возвращать список их адресов(List<Address>)

        List<Person> persons = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        persons.add(new Person("Ivanov", new Address("London, Baker Street ", 5)));
        persons.add(new Person("Petrov", new Address("New York, Fulton Street", 171)));
        addresses.add(new Address("London, Baker Street", 5));
        addresses.add(new Address("New York, Fulton Street", 171));

//        Person person1 = new Person("John", new Address("Street1", 1));


        System.out.println(getAddresses(persons));

    }

    public static List<Address> getAddresses(List<Person> persons) {
//       cresult = new ArrayList<>();

        List<Address> returnAddresses = new ArrayList<>();
        for (Person p : persons)
            returnAddresses.add(p.getAddress());
        return returnAddresses;
    }

}

//2.  Есть список с именами: John, Thomas, Tim, Jack,Amalia. Написать метод,
// возвращающий список, в котором не содержатся имена исходного списка длиной 4

//3.Есть два листа одинаковой длины с целыми числами. Написать метод,
// возвращающий лист с элементами Yes или No_ где значение на i-ом месте
// зависит от того равны ли элементы двух списков под номером i.
// Например {1,2,3,4} and {5,2,3,0} вернет {No,Yes,Yes,No}
public class Person implements Comparable<Person> {
    // implements Comparable - если хотите сравнивать объекты
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        // сравнивается объекты this и o
        // в нашем примере this - person1, а o - person2.
        // если возвращается число < 0, то person1 "меньше" person2
        // если возвращается число > 0, то person1 "больше" person2
        // если возвращается число = 0, то person1 "равен" person2

        // Сравнение лексикографически по полю name
//        return name.compareTo(o.name);

        // Другое правило сравнения -

        if (name.length() < o.name.length()) {
            return -1;
        }
        if (name.length() > o.name.length()) {
            return 1;
        } else {
            return 0;
        }

//        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

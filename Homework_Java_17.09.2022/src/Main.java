import java.util.HashSet;

// First level: Что выведет фрагмент кода:
public class Main {
    //First level: Что выведет фрагмент кода:
    public static void main(String[] args) {

        HashSet<Person> set = new HashSet<>();// Нужно указать класс в <>
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
        System.out.println("Set size is " + set.size());

        System.out.println("Фрагмент кода выведет размер множеcтва set!!!");

        Student student1 = new Student(1,"John");
        Student student2 = new Student(1, "John");
        System.out.println("student1 hashcode = " + student1.hashCode());
        System.out.println("student2 hashcode = " + student2.hashCode());
        System.out.println("student1.equals(student2) = " + student1.equals(student2));




    }


}

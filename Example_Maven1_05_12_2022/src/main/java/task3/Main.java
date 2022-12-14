package task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task4.Person2;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(person.getName());
        System.out.println(parrot.getName());
        System.out.println(person.getParrot().getName());
    }
}

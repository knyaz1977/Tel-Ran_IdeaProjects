package task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Создаем контекст!
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Person person = context.getBean(Person.class);
        Person2 person = context.getBean(Person2.class); // Самый используемый вариант
//        Person3 person = context.getBean(Person3.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(person.getName());
        System.out.println(parrot.getName());
        System.out.println(person.getParrot().getName());
    }

}
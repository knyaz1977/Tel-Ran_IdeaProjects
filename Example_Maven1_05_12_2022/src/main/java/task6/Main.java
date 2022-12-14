package task6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        // Выбор из нескольких бинов в контексте (Анатации @Qualifier и @Bean)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot2", Parrot.class);
        System.out.println(person.getName());
        System.out.println(parrot.getName());
        System.out.println(person.getParrot().getName());
    }
}

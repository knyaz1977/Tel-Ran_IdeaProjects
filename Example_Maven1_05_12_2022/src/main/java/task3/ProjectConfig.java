package task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    // Внедрение зависимости бина путем прямого вызова другого метода, помеченного аннотацией @Bean
//    @Bean
//    public Person person(){
//        Person p = new Person();
//        p.setName("Victor");
//        p.setParrot(parrot());
//        return p;
//    }

    // Внедрение зависимости бина путем передачи параметра в метод
    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Victor");
        p.setParrot(parrot());
        return p;
    }
}

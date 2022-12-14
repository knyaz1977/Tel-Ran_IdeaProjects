package task4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component // Создает @Bean этого класса (Person2)
public class Person2 {

    private String name = "John";

    private final Parrot parrot;

    @Autowired
    public Person2(Parrot parrot) {
        this.parrot = parrot;
    }

}
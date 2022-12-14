package task7;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data // Дает все конструкторы (Это делает lombok)
@Component // создастся бин Person
public class Person {

    private  String name;

    private final Parrot parrot;

    @Autowired // Здесь заинжектится связь с Parrot
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
    }
}

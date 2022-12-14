package task5;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data

@Component
public class Person {

    private String name = "John";

    private final Parrot parrot;

    @Autowired
   public Person(Parrot parrot){
        this.parrot = parrot;
    }

}
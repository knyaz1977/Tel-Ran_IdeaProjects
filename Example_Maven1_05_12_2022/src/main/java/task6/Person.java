package task6;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
public class Person {

    private String name;

    private Parrot parrot;

}
package task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Создает @Bean этого класса (Person3)
public class Person3 {

    private String name = "John";

    private Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
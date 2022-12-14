package task4;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data // Переопределяет toString(Это делает lombok)
@AllArgsConstructor // Автоматически создает конструкторы с одним значением, геттеры и сеттеры
@NoArgsConstructor // Автоматически создает конструкторы без значений, геттеры и сеттеры
@Component // Создает @Bean этого класса (Person)
public class Person {

    private String name = "John";

    @Autowired // - Анатация. Мы даем команду спрингу извлечь бин из контекста и
    // присвоить его в качестве значения поля, которое помечено
    // этой анатацией(Parrot)
    private Parrot parrot;

}
package task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data // Переопределяет toString(Это делает lombok)
@AllArgsConstructor // Автоматически создает конструкторы с одним значением, геттеры и сеттеры
@NoArgsConstructor // Автоматически создает конструкторы без значений, геттеры и сеттеры
@Component // Создает @Bean этого класса (Parrot)
public class Parrot {

    private String name = "Koko";

}
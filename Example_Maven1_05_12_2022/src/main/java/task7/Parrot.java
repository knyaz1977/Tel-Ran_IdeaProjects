package task7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Переопределяет toString(Это делает lombok)
@AllArgsConstructor // Автоматически создает конструкторы с одним значением, геттеры и сеттеры
@NoArgsConstructor // Автоматически создает конструкторы без значений, геттеры и сеттеры
public class Parrot {

    private String name;

}

package task4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Анатация
@ComponentScan(basePackages = "task4") // Сканируй весь task4 в поисках компонентов
public class ProjectConfig {
}
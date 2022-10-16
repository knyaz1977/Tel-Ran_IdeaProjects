import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // First level: Описать класс "цветная точка". Для точки задаются координаты и цвет. Цвет описывается
        // с помощью трех составляющих (красный, зеленый, синий). Предусмотреть различные методы инициализации
        // объекта с проверкой допустимости значений. Допустимым диапазоном для каждой составляющей является [0, 255].
        // Описать свойства для получения состояния объекта и метод изменения цвета.
        // Написать программу, демонстрирующую все разработанные элементы класса.
        // Разрабатываемый класс должен, как правило, содержать следующие элементы: скрытые поля, конструкторы
        // с параметрами и без параметров, методы, свойства.
        System.out.println("Input the brightness value for the red, green, and blue colors sequentially.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        ColoredDot coloredDot1 = new ColoredDot();
        System.out.println(coloredDot1);
        ColoredDot coloredDot = new ColoredDot(x, y, r, g, b);

        System.out.println(coloredDot.setR(r));
        coloredDot.max(r);
        coloredDot.min(r);
        System.out.println(coloredDot.setG(g));
        coloredDot.max(g);
        coloredDot.min(g);
        System.out.println(coloredDot.setB(b));
        coloredDot.max(b);
        coloredDot.min(b);

        ColoredDot[] coloredDots = {coloredDot};
        System.out.println(coloredDots[0]);

    }
}

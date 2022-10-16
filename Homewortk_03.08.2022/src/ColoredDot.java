public class ColoredDot {
    // First level: Описать класс "цветная точка". Для точки задаются координаты и цвет. Цвет описывается
    // с помощью трех составляющих (красный, зеленый, синий). Предусмотреть различные методы инициализации
    // объекта с проверкой допустимости значений. Допустимым диапазоном для каждой составляющей является [0, 255].
    // Описать свойства для получения состояния объекта и метод изменения цвета.
    // Написать программу, демонстрирующую все разработанные элементы класса.
    // Разрабатываемый класс должен, как правило, содержать следующие элементы: скрытые поля, конструкторы
    // с параметрами и без параметров, методы, свойства.

    private int x;
    private int y;
    private int r; // ПОЛЕ
    private int g;
    private int b;
    int min;
    int max;

    public ColoredDot() {
        x = 0;
        y = 0;
        r = 0;
        g = 0;
        b = 0;
    }

    public ColoredDot(int x, int y, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int max(int max) {
        if (max > 255) {
            this.max= 255;
            System.out.println("Invalid value inputed");
        }
        return max;
    }

    public int min(int min) {
        if (min < 0) {
            this.min = 0;
            System.out.println("Invalid value inputed");
        }
        return min;
    }

    @Override
    public String toString() {
        return "ColoredDot{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }

    public int setR(int r) {
        return r;
    }

    public int setG(int g) {
        return g;
    }

    public int setB(int b) {
        return b;
    }
}

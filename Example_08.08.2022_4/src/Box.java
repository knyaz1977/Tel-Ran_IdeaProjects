public class Box {

    double width; // Поле
    double height;
    double depth;

    // Сконструировать клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Конструктор инициализирует все поля
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
        //width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

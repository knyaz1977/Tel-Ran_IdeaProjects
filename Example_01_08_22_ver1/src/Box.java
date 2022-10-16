public class Box {

    // Поля класса
    double width; // ширина
    double height; // высота
    double depth; // глубина

    //  Это конструктор класса Box
    Box() {
        System.out.println("Constructor of Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
//        width = w;
//        height = h;
//        depth = d;
    }

    // Рассчиать и возвратить объем параллелепипеда
    double getVolume() {
        return width * height * depth;
//        System.out.println("Volume = " + volume);
    }

    // Установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

}

public class BoxWeight extends Box {

    double weight; // вес

    // Конструктор с 4мя полями
    BoxWeight(double width, double height, double depth, double weight) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;

        super(width, height, depth); // можно записать коротко три поля выше.
        // super - Супер класс. Используется только в наследовании
        this.weight = weight;
    }
}
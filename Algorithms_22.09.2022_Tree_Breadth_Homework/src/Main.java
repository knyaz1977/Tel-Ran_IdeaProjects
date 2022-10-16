
public class Main {
    // First level: Реализовать алгоритм обхода двоичного дерева поиска в ширину.
    // Здесь можно применить, изученную нами ранее, структуру данных Queue.
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(6);
        tree.insert(8);
        tree.insert(4);
        tree.insert(5);
        tree.insert(3);
        tree.insert(9);
        tree.insert(7);

        tree.searchByWidth(11);
    }

}

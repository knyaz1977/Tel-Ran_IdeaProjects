
public class Main {
// Дано бинарное дерево поиска. Реализовать метод поиска в нем элемента.
// В качестве параметра этому методу передается value.
// Метод должен вернуть true/false, если value представлено в дереве.
// Второй вариант, что метод должен вернуть указатель на найденный элемент
// или null, если value не представлено в дереве.
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(4);
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(5);
        tree.insert(3);

        System.out.println(tree.findNodeByValue(5));
    }

}
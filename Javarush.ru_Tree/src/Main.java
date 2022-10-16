class Application {
    public static void main(String[] args) {
        Tree2 tree = new Tree2();
        // вставляем узлы в дерево:
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        // отображение дерева:
        tree.printTree();

        // удаляем один узел и выводим оставшееся дерево в консоли
        tree.deleteNode(5);
        tree.printTree();

        // находим узел по значению и выводим его в консоли
        Node foundNode = tree.findNodeByValue2(1);
        foundNode.printNode2();
    }
}
public class Tree {

    TreeNode root;

    public void insert(int value) {
        TreeNode temp = new TreeNode();
        temp.value = value;
        if (root == null) {
            // Дерево пока пустое и значит новый элемент temp
            // есть теперь root
            root = temp;
        } else {
            // В дереве уже существуют элементы и нужно найти
            // подходящее место для вставки нашего temp
            TreeNode p = root;
            while (true) {
                if (value < p.value) {
                    // Идем влево от p
                    if (p.leftChild != null) {
                        // Влево от p занято
                        p = p.leftChild;
                    } else {
                        // Влево от p свободно
                        p.leftChild = temp;
                        return;
                    }
                } else {
                    // Идем вправо от p
                    if (p.rightChild != null) {
                        // Вправо от p занято
                        p = p.rightChild;
                    } else {
                        // Вправо от p свободно
                        p.rightChild = temp;
                        return;
                    }
                }
            }
        }
    }

    private class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;

        public int getValue() {
            return this.value;
        }
        public TreeNode getLeftChild() {
            return this.leftChild;
        }
        public TreeNode getRightChild() {
            return this.rightChild;
        }
        public void printNode() { // Вывод значения узла в консоль
            System.out.println(" Выбранный узел имеет значение :" + value);
        }
    }

    public boolean findNodeByValue(int value) { // поиск узла по значению
       TreeNode currentNode = root; // начинаем поиск с корневого узла
        while (currentNode.getValue() != value) { // поиск пока не будет найден элемент или не будут перебраны все элементы
            if (currentNode.getValue() == value) {
                return true;
            }
            if (value < currentNode.getValue()) { // движение влево
                currentNode = currentNode.getLeftChild();
            } else { //движение вправо
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) { // если потомка нет,
                return false; // возвращаем false
            }
        }
        return true; // возвращаем tru если найден элемент
    }
}
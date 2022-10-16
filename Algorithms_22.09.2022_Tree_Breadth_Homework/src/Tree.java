import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    int value;
    Tree leftChild = null;
    Tree rightChild = null;
    Tree root;

    public int getValue() {
        return this.value;
    }

    public Tree getLeftChild() {
        return this.leftChild;
    }

    public Tree getRightChild() {
        return this.rightChild;
    }

    public void printNode() { // Вывод значения узла в консоль
        System.out.println(" Выбранный узел имеет значение :" + value);
    }

    public Tree() {
        this.value = getValue();
    }

    public void searchByWidth(int val) {

        if (root == null) {
            System.out.println("Дерева нет! Создайте двоичное дерево!");
            return;
        }
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(root);
        int c = 0;
        while (!queue.isEmpty()) {
            Tree tree = queue.remove();
            if (tree.value == val) {
                c ++;
                System.out.print(" " + tree.value);

            } else {
                System.out.print(" " + tree.value);
            }
            if (tree.getLeftChild() != null) {
                queue.add(tree.getLeftChild());
            }
            if (tree.getRightChild() != null) {
                queue.add(tree.getRightChild());
            } else if (queue.isEmpty()) {
                System.out.println();

            }
        }
        if (c == 0) {
            System.out.print(" Элемент " + val + " не найден!");

        } else {
            System.out.print(" Элемент " + val + " найден " + c + " раз!");
        }
    }

    public void insert(int value) {
        Tree temp = new Tree();
        temp.value = value;
        if (root == null) {
            // Дерево пока пустое и значит новый элемент temp
            // есть теперь root
            root = temp;
        } else {
            // В дереве уже существуют элементы и нужно найти
            // подходящее место для вставки нашего temp
            Tree p = root;
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
}

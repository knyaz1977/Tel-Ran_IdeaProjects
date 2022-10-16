import javax.swing.tree.TreeNode;

public class Tree {

    TreeNode root; // корень

    public void insert(int value) {
        TreeNode temp = new TreeNode();
        temp.value = value;
        if (root == null) {


            root = temp;
        } else {
            // В дереве уже существуют элементы и нужно найти
            // подходящие место для вставки нашего temp
            TreeNode p = root;
            while (true) { // пока условие истинно
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
                        // Влево от p свободно
                        p = p.rightChild;

                    }
                }
            }
        }
    }

    private class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;
    }
}




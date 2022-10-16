import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input formula");
//        String f = scanner.nextLine();
//        // Написать алгоритм, который вычисляет выражение в строке f
//        // ...
//
//        System.out.println(f);

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(21);

//        tree.insert(4);
//        tree.insert(2);
//        tree.insert(20);
        tree.pass(); // ВЫЗОВ РЕКУРСИВНОГО МЕТОДА
        System.out.println();
        tree.pasIterative(); // ВЫЗОВ ИТЕРАТИВНОГО МЕТОДА

        System.out.println(tree.searchElement(15));
        System.out.print(tree.search(15));
    }
}

public class Main {

    public static void main(String[] args) {
        // First level: Дан односвязный список (указатель на его начало head).
        // Дано натуральное число k.
        // Удалить из этого списка k-ый элемент с конца.
        //Подсказка: используйте метод двух указателей для поиска K-го элемента с конца.
        List list = new List();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(i));
        }
        int k = 4;
        list.printList();
        System.out.println();
        list.removeFromEnd(k);
        System.out.println("Вывод cпиcка без " + k + "-го елемента c конца");
        list.printList();


//        }

    }
}

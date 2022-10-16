import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet();
        Set<String> hashSet = new TreeSet<>(); // TreeSet сортирует по возрастанию
        hashSet.add("Germany");
        hashSet.add("France");
        hashSet.add("Italy");
        // Добавление повторного элемента
        boolean isAdded = hashSet.add("France");
        System.out.println(isAdded); // false - так как уникальные элементы
        System.out.println("size = " + hashSet.size());
        for (String s : hashSet) {
            System.out.println(s);
        }

    }
}

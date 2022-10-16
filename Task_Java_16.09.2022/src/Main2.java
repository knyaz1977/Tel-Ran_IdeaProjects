import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a = scanner.nextInt();
        // Hi = Привет
        // World = Мир
        // Ivan = Иван
        // Car = машина
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hi", "Привет");
        dictionary.put("World", "Мир");
        dictionary.put("Ivan", "Иван");
        dictionary.put("Car", "Машина");

//        String car = dictionary.get("Car");
//        System.out.println(car);

        String str = "Hi World, Hi Ivan";

        String[] strings = str.replace(",", " ").split(" "); // split - разбивает на массив слов,
        // replace - игнорирует
        for (String s : strings) {
            if (!s.isEmpty())

                System.out.println(dictionary.get(s));
        }
    }
}

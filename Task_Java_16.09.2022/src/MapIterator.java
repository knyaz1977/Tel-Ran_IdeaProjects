import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MapIterator {

    public static void main(String[] args) {


        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hi".toUpperCase(Locale.ROOT), "Привет");
        dictionary.put("Hello".toUpperCase(Locale.ROOT), "Привет");
        dictionary.put("World".toUpperCase(Locale.ROOT), "Мир");
        dictionary.put("Ivan".toUpperCase(Locale.ROOT), "Иван");
        dictionary.put("Car".toUpperCase(Locale.ROOT), "Машина");


        String str = "Hello Cars, Ivan52, Worlds";

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (str.contains(key)) {
                System.out.println(value);
            }
        }
    }
}
// import java.util.*;
//
//public class MapIterator {
//    public static void main(String[] args) {
//
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("Hi", "Привет");
//        dictionary.put("Hello", "Привет");
//        dictionary.put("World", "Мир");
//        dictionary.put("Ivan", "Иван");
//        dictionary.put("Car", "Машина");
//
//        String str = "Hello Cars, Ivan52, Worlds";
//
//        for(Map.Entry<String, String> entry: dictionary.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            if(str.contains(key)) {
//                System.out.println(value);
//            }
//        }
//    }
//}
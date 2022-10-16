import java.util.Comparator;

public class CityComparator implements Comparator<House> {

    public int compare(House h1, House h2) {
        if (h1.city.length() == h2.city.length()) {
            return 0;
        }
        if (h1.city.length() > h2.city.length()) {
            System.out.println(h1 + " länger als  " + h2);
            return 1;
        }
        else {
            System.out.println(h1 + " kürzer als  " + h2);
            return -1;
        }
    }
}
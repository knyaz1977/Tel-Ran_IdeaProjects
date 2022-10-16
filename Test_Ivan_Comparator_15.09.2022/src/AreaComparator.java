import java.util.Comparator;

public class AreaComparator implements Comparator<House> {

    @Override
    public int compare(House h1, House h2) {
        if (h1.area == h2.area) {
            System.out.println(h1 + " und  " + h2 + " sind gleich");
            return 0;
        }
        if (h1.area> h2.area) {
            System.out.println(h1 + " größer als  " + h2);
            return 1;
        }
        else {
            System.out.println(h1 + " kleiner als  " + h2);
            return -1;
        }
    }
}
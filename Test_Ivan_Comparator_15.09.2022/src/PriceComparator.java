import java.util.Comparator;
import java.util.function.Function;

public class PriceComparator implements Comparator<House> {

    @Override
    public int compare(House h1, House h2) {
        if (h1.price == h2.price) {
            return 0;
        }
        if (h1.price > h2.price) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
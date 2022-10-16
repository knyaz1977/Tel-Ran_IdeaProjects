import java.util.SortedMap;

public class Guitar implements MusicalInstrument{

    private int dimension;

    public Guitar(int dimension) {

        this.dimension = dimension;
    }

    @Override
    public void play() {
        System.out.println("Guitar plays with string count " + dimension);
    }
}

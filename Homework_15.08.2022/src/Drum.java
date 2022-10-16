public class Drum implements Toolable {

    int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("A drum with a size of " + size + " is playing");
    }
}

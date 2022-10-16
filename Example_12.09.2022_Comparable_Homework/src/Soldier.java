public class Soldier implements Comparable<Soldier> {

    private int height;

    public Soldier(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "height=" + height +
                '}';
    }

    @Override
    public int compareTo(Soldier o) {
//        return o.height - this.height;
        if (this.height < o.height) {
            return 1;
        } else if (this.height > o.height) {
            return -1;
        } else {
            return 0;
        }
    }

}


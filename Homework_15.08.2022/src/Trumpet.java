public class Trumpet implements Toolable {

    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("A trumpet with a diameter of " + diameter + " is playing");
    }
}

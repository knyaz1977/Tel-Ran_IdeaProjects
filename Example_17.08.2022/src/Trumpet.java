public class Trumpet implements MusicalInstrument{

    private int diametr;

    public Trumpet(int diametr) {

        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Trumpet plays with diametr " + diametr);
    }
}

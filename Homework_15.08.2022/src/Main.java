public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(25);
        Trumpet trumpet = new Trumpet(10);

        Toolable[] tools = {guitar, drum, trumpet}; // {new Guitar(6), new Drum(25), new Trumpet(10)} короткая запись,
        // тогда три верхние не нужны.
        for (Toolable t : tools) {
            t.play();
        }
    }
}


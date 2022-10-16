public class Main {

    public static void main(String[] args) {
        MusicalInstrument drum = new Drum(12.0); // пример перенаследования типа
        MusicalInstrument[] instruments = {drum, new Guitar(7), new Trumpet(5)}; // чтобы не создавать 3 раза(drum, guitar и trumpet), можно так коротко записать
        for (MusicalInstrument instrument : instruments) {
            instrument.play();
        }

        System.out.println(MusicalInstrument.KEY);
    }
}

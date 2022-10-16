public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java. Complete referense", "H.Shildt");
        book.print();
        Journal journal = new Journal("Foreign Policy");
        journal.print();

        Printable printable = book;
        printable.print();

        System.out.println();

        Printable[] printables = {book, journal};
        for (Printable p : printables) { // (int i = 0; i < printables.length; i++)
            p.print(); // p = printables[i]
        }

        Printable.read();

    }
}

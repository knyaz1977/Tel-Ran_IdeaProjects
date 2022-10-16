public interface Printable {

    // реализация методов по умолчанию
    default void print() { // по умолчанию все publick. private можно, но он тогда должен быть реализован.
        System.out.println("Underfined printable"); // Underfined printable - Не определено для печати
    }

    // void print(); // по умолчанию public

    static void read() {
        System.out.println("Read printable");
    }
}

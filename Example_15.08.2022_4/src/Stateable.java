public interface Stateable {

    int OPEN = 1; // по умолчанию имеют модификатор public static final
    int CLOSED = 0; // константы

    void printState(int n);


}

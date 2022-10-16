@FunctionalInterface
public interface Converterable<T, N> {

    N convert(T t);

    static <T> boolean isNotNull(T t) {
        return t != null;
    }

    default  void writeToConsole(T t) {
        System.out.println(t.toString());
    }

}

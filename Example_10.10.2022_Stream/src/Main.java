import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        long count = IntStream.of(-1, 0, 2, 4, 6, 7).filter(a -> a > 0).count();

        System.out.println(count);

        IntStream filteredStream = IntStream.of(-1, 0, 2, 4, 6, 7).filter(a -> a > 0);
        long count2 = filteredStream.count();
        System.out.println(count2);

        // Не отработает, т.к. поток filteredStream уже закрыт командой выше!
//        System.out.println(filteredStream.distinct().min());

    }
}

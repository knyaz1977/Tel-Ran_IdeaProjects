public class Main {

    public static void main(String[] args) {
        /// Описать класс, реализующий десятичный счетчик, который может увеличивать
        // или уменьшать свое значение на единицу в заданном диапазоне. Предусмотреть
        // инициализацию счетчика значениями по умолчанию и произвольными значениями.
        // Счетчик имеет два метода: увеличения и уменьшения, и свойство, позволяющее
        // получить его текущее состояние.
        Counter cnt = new Counter();
        cnt.plus();  // вручную вызываем счетчик 1 раз
        cnt.plus(); // вручную вызываем счетчик 2 раз. Можно задать цикл
        System.out.println(cnt.getCount());
        cnt.minus();
        System.out.println(cnt.getCount());

//        cnt.count = 100; // т.к. мы сделали private
        System.out.println(cnt.getCount());
        cnt.plus();
        System.out.println(cnt.getCount());
        cnt.plus();
        System.out.println(cnt.getCount());

        Counter cnt2  = new Counter(100,0,200);

    }
}

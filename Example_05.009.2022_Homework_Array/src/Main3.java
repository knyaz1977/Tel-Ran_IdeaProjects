public class Main3 {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 300);
        Car car2 = new Car("Ferrari", 300);

        System.out.println(car1 == car2); // сравнение по ссылкам

        System.out.println(car1.equals(car2));

        Bike bike = new Bike("Ferrari", 300);
        System.out.println(car1.equals(bike));
        System.out.println(car1.getClass());
        System.out.println(bike.getClass());
        System.out.println();

        System.out.println(car1.equals(car1));

        Car car3 = null;
        System.out.println(car1.equals(car3));

        // Object -> toString(), getClass(). equals(). hashCode()

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        // 1. Если два объекта равны (т.у. метод equals() возвращает (true),
        //    у них должен быть одинаковый хэш-код
        // 2. Если hashCode() вызывается несколько раз на одном и том же объекте,
        //    то каждый раз он должен возвращать один и тот же результат.
        // 3. Правило 1 не работает в обратную сторону.
        //    Одинаковый хэшкод может быть у двух разных объектов.

        Car car4 = new Car("Ferrari", 300);
        Car car5 = new Car("Ferrari 2", 300);
        System.out.println(car4.equals(car5));
        System.out.println(car4.hashCode());
        System.out.println(car5.hashCode());
    }
}

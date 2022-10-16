public class Main {
    // First level: Написать лямбда выражение для интерфейса Printable,
    // который содержит один метод void print().
    //
    //Second level: Написать функциональный интерфейс с методом,
    // который принимает число и возвращает булево значение.
    // Написать реализацию такого интерфейса в виде лямбда-выражения,
    // которое возвращает true если переданное число делится без
    // остатка на 13.
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Печатаем что-нибудь");
            }
        };
        // код выше короткая запись с лямбдой.
        Printable lambda = () -> System.out.println("Печатаем что-нибудь");

        Checkable checkable1 = new Checkable() { // При написании new Checkable()
            // при выборе интерфейса со скобками IDEA сама сделает @Override
            @Override
            public boolean checkNumber(int number) {
                return number % 13 == 0;
            }
        };

        Checkable checkable2 = new Checkable() {
            @Override
            public boolean checkNumber(int number) {
                if (number % 13 == 0) { // для короткой записи навести курсор
                    // на if и нажимаем Simplify.
                    // Результат ( return number % 13 == 0;)
                    return true;
                } else {
                    return false;
                }
            }
        };

        Checkable checkable3 = number -> number % 13 == 0;

        Check a = new Check();
        boolean result = a.checkNumber(26); // true


        // Абстрактный класс
        Checkable checkable4 = new Checkable() {
            @Override
            public boolean checkNumber(int number) {
                return number % 13 == 0;
            }
        };

//        (int a) -> {
//            if (a % 13 == 0) {
//                return true;
//            }else{
//                return false;
//            }
//
//        }

//        System.out.println(1 + 2);
//        int a = 1 + 2;
//        System.out.println("qwerty");
//        String s = "qwerty";

    }
}

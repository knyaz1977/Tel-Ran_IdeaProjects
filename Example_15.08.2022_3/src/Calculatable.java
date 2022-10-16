public interface Calculatable {

    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }

    // privat - метод работает только внутри интерфейса и должен быть обязательно реализован!
    private int sumAll(int... values) { // когда число переменных(values - значение) неизвестно.
        int result = 0;
        for (int ar : values) {
            result = result + ar;
        }
        return result;
    }

}

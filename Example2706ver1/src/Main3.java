public class Main3 {

    public static void main(String[] args) {
        // Демонстрация передачи параметров в метод по значению
        // Альтернативным методом передачи параметров в метод является метод по ссылке
        int a = 1, b = 2;
        System.out.println("In main before a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("In main after a = " + a + ", b = " + b);
    }

    // Метод меняет местами значения переменных
    private static void swap(int a, int b) {
        System.out.println("In swap before a = " + a + ", b = " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("In swap after a = " + a + ", b = " + b);
    }



}

public class Main {

    public static void main(String[] args) {
        B objB = new B(1, 2, 3);
        System.out.println(objB.toString()); // объект переводим в строку. toString можно не указывать
        // а потом строку печатаем

        objB.show();
    }

    // Динамическая диспетчеризация методов
}

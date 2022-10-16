public class MAin {

    public static void main(String[] args) {

        // for(зона инициализации; условие выполнения цикла;
        for (int counter = 1; counter < 5; counter++) {

            putIntoBasket(counter);

        }
        int counter = 2;
        System.out.println();
        doWhile(counter);


        System.out.println();
        invokeWhile(counter);


    }

    private static void doWhile(int counter) {
//        int counter3 = 1;
        do {
            System.out.println("Положил в корзину " + counter);
            counter = counter+ 2;
        } while (counter < 10);
    }

    private static void invokeWhile(int counter) {
//        int counter2 = 1;

        while (counter < 5) {
            System.out.println("Положил в корзину " + counter);
            counter++;
        }
    }

    private static void putIntoBasket(int i) {
        System.out.println("Положил в корзину " + i);
    }

}

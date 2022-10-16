public class Main {

    public static void main(String[] args) {
        // Создайте класс Author  с полями firstName и lastName, добавьте конструктор, геттеры, сеттеры и toString.
        // Создайте класс Book с полями title, author: Author и price. Напишите конструктор, геттеры, сеттры и toString
        // Создайте класc Pizza, поля size типа String (с возможными значениями "small", "medium", "large"), cheese:int,
        // pepperoni:int,ham:int=0. Добавьте конструктор вида Pizza(String size, int cheese, int pepperoni, int ham),
        // геттеры,сеттеры и toString. Добавьте метод calcPrice(): int - маленькая 10, средняя 12, большая 14 и
        // каждый топпинг по 2. Создайте класс PizzaOrder куда можно будет добавлять пиццу  методом add(Pizza)
        // и напишите в этом классе метод calcTotalPrice(): int который вычислит стоимость всех заказанных пицц.
        String size = "large";
        int cheese = 1;
        int pepperoni = 2;
        int ham = 1;
        Pizza pizza1 = new Pizza(size, cheese, pepperoni, ham);
        System.out.println(pizza1);
        int calcPrice;
        calcPrice = pizza1.calcPrice();
        System.out.println("calcPrice = " + calcPrice);

        String size2 = "small";
        int cheese2 = 2;
        int pepperoni2 = 0;
        int ham2 = 1;
        Pizza pizza2 = new Pizza(size2, cheese2, pepperoni2, ham2);
        System.out.println(pizza2);
        int calcPrice2;
        calcPrice2 = pizza2.calcPrice();
        System.out.println("calcPrice = " + calcPrice2);

        PizzaOrder pizza = new PizzaOrder(size2, cheese, pepperoni2, ham);
        System.out.println(pizza);
        int calcPrice3;
        calcPrice3 = pizza.calcPrice();
        System.out.println("calcPrice = " + calcPrice3);
    }
}

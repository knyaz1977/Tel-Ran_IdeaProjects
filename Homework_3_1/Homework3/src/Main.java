

public class Main {

    public static void main(String[] args) {

        // Task1
        // Напишите метод, который вычисляет выражение a * (b + (c / d))
        // и возвращает результат, где a, b, c, d - целочисленные входные
        // параметры этого метода.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input four numbers via enter!");
        double number1 = scanner.nextDouble(); // вводим вещественные числа
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double number4 = scanner.nextDouble();
        System.out.println(expression((int) number1, (int) number2, (int) number3, (int) number4)); // преобразовываем по условию в целочисленные

        // Task2
        // Напишите метод, которому в качестве параметра передается строка, указывающая имя.
        // Метод должен возвращать приветственное сообщение:
        // "Привет, passed_name!". Выведите приветствие на консоль.
        System.out.println();
        System.out.println("Input your name!");
        String name = scanner.next();
        printHello(name);

        // Task3
        // Реализуйте метод, который конвертирует заданную сумму в евро в сумму в долларах США
        System.out.println();
        System.out.println("Input the cost of 1 Euro in Dollars!");
        double costS = scanner.nextDouble();
        System.out.println("Input the desired Euro amount to exchange");
        double sumE = scanner.nextDouble();
        //printCost(costS, sumE);
        System.out.println("At the exchange rate of 1 Euro = " + costS + " dollars " + sumE + " Euros = " + printCost(costS, sumE) + " dollars");

        // Task4
        // Внедрите метод, который вычисляет, сколько дополнительных калорий будет,
        // если вы купите пиццу диаметром n см (параметр метода) вместо пиццы диаметром 24 см.
        // Чтобы решить эту проблему, давайте предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
        System.out.println();
        System.out.println("To calculate calories, input the diameter of the pizza");
        double n = scanner.nextDouble();
        System.out.println("The amount of additional calories will be " + printPizza(n));

        // Task5
        // Реализуйте программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
        // Каждая из арифметических операций должна быть реализована как отдельный метод.
        System.out.println();
        System.out.println("Input two numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("The result of adding two numbers " + a + " and " + b + "  is " + printSum(a, b));
        System.out.println("The result of subtracting two numbers " + a + " and " + b + " is " + printSub(a, b));
        System.out.println("The result of multiplying two numbers " + a + " and " + b + " is " + printMult(a, b));
        System.out.println("The result of dividing two numbers " + a + " and " + b + " is " + printDiv(a, b));

    }

    private static double expression(double a, double b, double c, double d) { // если значения поставить с int, то ответ будет не верный, т.к. при делении int/int=int
        double result = a * (b + (c / d));
        return result;
    }

    private static void printHello(String name) {
        System.out.println();
        System.out.println("Hello, " + name + "!");
    }

    private static double printCost(double costS, double sumE) {
        double costE = costS * sumE;
        return costE;
    }

    private static double printPizza(double n) {
        double r1 = n / 2;
        double r2 = 24 / 2;
        double dk = (Math.PI * Math.pow(r1, 2) - Math.PI * Math.pow(r2, 2)) * 40;
        return dk;
    }

    private static double printSum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    private static double printSub(double a, double b) {
        double sub = a - b;
        return sub;
    }

    private static double printMult(double a, double b) {
        double mult = a * b;
        return mult;
    }

    private static double printDiv(double a, double b) {
        double div = a / b;
        return div;
    }

}
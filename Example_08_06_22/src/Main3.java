import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 2;
//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
        int max = (a > b) ? a : b; // короткая форма записи выше// : = else// a > b это условие //тернарный оператор
        System.out.println("max= " + max);

        System.out.println();
        System.out.println("Input zou age");
        int age = scanner.nextInt();
        // Если age >= 18, то в переменную result помещается строка "Ok",
        // иначе в переменную result помещается строка "not allowed"
//        Тернарный оператор
        String result = (age >= 18) ? "Ok" : "not allowed";
        System.out.println(result);


    }

}

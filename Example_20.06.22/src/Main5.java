public class Main5 {

    public static void main(String[] args) {
        String str = "Hello, Java!"; // "" - выводит СТРОКУ
        //str.charAt(5) // нахождение символа строки по индексу (индекс = 5)
        //str.length() // длина строки
        //str.toLowerCase() // перевод строки в нижний регистр
        //str.toUpperCase() // перевод строки в верхний регистр

//        Найти количество букв 'a' в строке str
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') { // '' - выводит СИМВОЛ
                count++;
            }

            System.out.println(str.charAt(i));// выводит по одной букве
        }
        System.out.println();
        System.out.println(count);

        // Найти номер первой буквы 'a' в строке str
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println(i); // выводит порядковый номер для буквы 'a'
                break; // оператор прерывания цикла (выполнение продолжится с 28 строки)
            }
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                continue; // Оператор пропуска нижестоящих действий в цикле (выполнение продолжится со следующего i)

            }
            System.out.println(str.charAt(i));
        }
        // i = 0..11
        // i = 0 continue -> i = 1
        // i = 1 System.out.println('e');
        // i = 2 continue -> i = 3
        // i = 3 System.out.println('l');
        // i = 4 continue -> i = 5
        // i = 5 System.out.println(',');

        // Выведем на экран
        // вложенные циклы
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


    }
}
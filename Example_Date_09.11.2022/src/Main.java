import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//      String date = "09 nov 2022";
        Date date = new Date();
        System.out.println(date); // Wed Nov 09 10:48:54 CET 2022
        System.out.println(date.getTime()); // 1667987334737

        Date date1 = new Date(121212121212121L);
        Date date2 = new Date(1200L);
        System.out.println(date1);
        System.out.println(date2);

        // Сравнение дат
        // а) сравнение миллисекунд
        Date date3 = new Date();
        System.out.println((date.getTime() > date3.getTime()) ?
                "date after date3" : "date before date3"); // ? - то, : - иначе
        // б) использование методов before и after класса Date
        System.out.println(date.before(date3));
        if (date.after(date3)) {
            // что-то выполнить
        }
        // в) использование методов equals (недостаток, что только анализируем равенство)
        if (date.equals(date2)) {

        }
        System.out.println(date.getHours());


    }
}

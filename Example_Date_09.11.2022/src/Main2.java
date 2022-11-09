import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        System.out.println(calendar.getTime()); // Wed Nov 09 10:48:54 CET 2022

        Calendar calendar1 = new GregorianCalendar(2000, 1, 1);
        Calendar calendar2 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        System.out.println(calendar1.getTime()); // Tue Feb 01 00:00:00 CET 2000 // Нумерация месяцев с 0 в Java
        System.out.println(calendar2.getTime()); // Sat Jan 01 00:00:00 CET 2000

        System.out.println();
        Calendar calendar3 = new GregorianCalendar();
        calendar3.set(Calendar.YEAR, 2017);
        calendar3.set(Calendar.MONTH, Calendar.JULY);
        calendar3.set(Calendar.DAY_OF_MONTH, 6);
        calendar3.set(Calendar.HOUR_OF_DAY, 14);
        calendar3.set(Calendar.MINUTE, 35);
        calendar3.set(Calendar.SECOND, 45);
        System.out.println(calendar3.getTime());

        calendar3.add(Calendar.MONTH, 2);
        System.out.println(calendar3.getTime());
        System.out.println();
        calendar3.add(Calendar.MONTH, -2);
        System.out.println(calendar3.getTime());
        System.out.println();

        Calendar calendar4 = Calendar.getInstance();
        for (int i = 0; i < 30; i++) {
            System.out.println(calendar4.getTime());
            // передать в какой-то метод дату calendar4.getTime()
            calendar4.add(Calendar.DAY_OF_MONTH, -1);
        }
        System.out.println(calendar4.get(Calendar.HOUR_OF_DAY));

        System.out.println();

        Calendar calendar5 = new GregorianCalendar(216, Calendar.AUGUST, 2);
        calendar5.set(Calendar.ERA, GregorianCalendar.BC);
        System.out.println(calendar5.getTime());

    }
}

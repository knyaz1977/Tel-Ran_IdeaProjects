import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main3 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));

        System.out.println();

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM yyy GG");
        Calendar calendar5 = new GregorianCalendar(216, Calendar.AUGUST, 2);
        calendar5.set(Calendar.ERA, GregorianCalendar.BC);
        System.out.println(sdf2.format(calendar5.getTime()));

        // https://divancoder.ru/2017/12/simpledateformat/

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd.MM.yyyy");
        String strDate = "09.11.2022";
        try {
            Date date1 = sdf3.parse(strDate);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

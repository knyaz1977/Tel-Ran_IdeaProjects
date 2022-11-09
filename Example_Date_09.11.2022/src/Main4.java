import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2022-11-09
        System.out.println(LocalDate.of(2017, 6, 7)); // 2017-06-07

        LocalDate todayMsk = LocalDate.now(ZoneId.of("Europe/Moscow"));
        System.out.println(todayMsk); // 2022-11-09

        // https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        // Выведет все временные пояса
//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//        for (String zone : zoneIds) {
//            System.out.println(zone);
//        }
        System.out.println();
        System.out.println(today.getMonth()); // NOVEMBER месяц
        System.out.println(today.getDayOfMonth()); // 9 число
        System.out.println(today.getDayOfYear()); // 313 день в году
        System.out.println(today.getDayOfWeek()); // WEDNESDAY

        System.out.println();
        LocalDate localDate = today.plusMonths(1);
        System.out.println(localDate);
        System.out.println();
        System.out.println(today.minus(12, ChronoUnit.DECADES)); // ?????????????

        LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(21, 12, 34);
        LocalTime localTime2 = localTime1.plusHours(1);
        System.out.println(localTime2.getHour());

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2016, Month.APRIL, 4, 22, 45);
//        localDateTime1.minus()

//        localDateTime1.toInstant(ZoneOffset.ofHours(4));
        System.out.println();

        Instant instant = Instant.now();
        System.out.println(instant);
//        Instant.ofEpochMilli()dd
        System.out.println();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dtf.format(LocalDateTime.now()));

        LocalDateTime localDateTime2 = LocalDateTime.parse("2022-11-09 11:35:45", dtf);
        System.out.println(localDateTime2);

        // Period Duration
        Period period = Period.between(localDate, LocalDate.now());
        System.out.println(period.getDays());


    }
}
